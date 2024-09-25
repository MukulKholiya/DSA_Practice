import java.util.ArrayList;

public class MapImplementation<K,V> {
    class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node> buck;
    public MapImplementation(){
        this(4);
    }
    public MapImplementation(int n){
        buck = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buck.add(null);
        }

    }
    private int size;

    public void put(K key, V value){
        int idx = hashfun(key);
        Node temp = buck.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;


        }
        temp = buck.get(idx);
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = temp;
        buck.set(idx,nn);
        size++;

        double loadFactor = (1.0*size)/buck.size();
        double threshhold = 2.0;
        if(loadFactor>threshhold){
            rehashing();
        }

    }

    @Override
    public String toString() {
        String s = "{";
        for(Node n:buck){
            while(n!=null){
                s = s+" "+ n.key + ":" + n.value+" , ";
                n=n.next;
            }
        }
        return s+" }";
    }

    public void rehashing(){
        ArrayList<Node> newBuck = new ArrayList<>();
        for (int i = 0; i < 2* buck.size(); i++) {
            newBuck.add(null);
        }
        ArrayList<Node> oldBuck = buck;
        buck = newBuck;
        size = 0;
        for(Node n:oldBuck){
            while(n!=null){
                put(n.key,n.value);
                n = n.next;
            }
        }


    }
    public int hashfun(K key){
        int bucketNumber = key.hashCode()%buck.size();
        if(bucketNumber<0){
            bucketNumber +=buck.size();
        }
        return bucketNumber;
    }
    public boolean containsKey(K key){
        int idx = hashfun(key);
        Node temp = buck.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public V get(K key){
        int idx = hashfun(key);
        Node temp = buck.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    public V remove(K key){
        int idx = hashfun(key);
        Node curr = buck.get(idx);
        Node prev = null;
        while(curr!=null){
            if(curr.key.equals(key)){
                break;

            }
            prev = curr;
            curr = curr.next;

        }
        if(curr==null) return null;
        if(prev==null){
            buck.set(idx,curr.next);
            size--;
        }
        else{
            prev.next = curr.next;
            size--;
        }
        return curr.value;
    }

}

