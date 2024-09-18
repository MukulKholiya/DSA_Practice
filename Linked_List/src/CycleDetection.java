public class CycleDetection {
    class Node{
        int val;
        linkedList.Node Next;
    }
    private linkedList.Node head;
    private linkedList.Node tail;
    private int size;
    public void addFirst(int item){
        linkedList.Node nn = new linkedList.Node();
        nn.val = item;
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.Next = head;
            head = nn;
            size++;
        }
    }
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            linkedList.Node nn = new linkedList.Node();
            nn.val = item;
            tail.Next = nn;
            tail = nn;
            size++;
        }
    }
    public linkedList.Node GetNode(int k)throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Range ke Bahar");
        }
        linkedList.Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.Next;
        }
        return temp;
    }
    public void Display(){
        linkedList.Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp = temp.Next;
        }
        System.out.println(".");
    }
    public void createCycle() throws Exception {
        linkedList.Node nn = GetNode(2);
        tail.Next = nn;

    }

    public static void main(String[] args) {
        CycleDetection cl = new CycleDetection();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addLast(80);
        cl.Display();
    }
}
