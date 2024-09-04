import java.util.ArrayList;
import java.util.PriorityQueue;

public class kthLargest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,8,10};
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(8);
        lst.add(10);
        System.out.println(kLargest(lst,9));

    }
    public static int kLargest(ArrayList<Integer> lst ,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        try {
            for (int i = 0; i < k; i++) {
                pq.add(lst.get(i));
            }
            for(int i=k ; i<lst.size() ; i++){
                if(pq.peek()<lst.get(i)){
                    pq.poll();
                    pq.add(lst.get(i));
                }
            }
            return pq.peek();
        }catch(Exception e){
            System.out.println(e);
        }


        return pq.peek(); 
    }
}
