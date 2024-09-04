import java.util.ArrayList;
import java.util.PriorityQueue;

class HeapNode implements Comparable<HeapNode>{
    int val,apos,vpos;
    public HeapNode(int v , int apos , int vpos){
        this.val = v;
        this.apos = apos;
        this.vpos = vpos;
    }

    @Override
    public int compareTo(HeapNode o) {
        return this.val - o.val;
    }

}
public class mergeSorted {
    public static ArrayList<Integer> merger(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<HeapNode> pq = new PriorityQueue<>();

        int k = arr.size();
        for (int i = 0; i < k; i++) {
            pq.add(new HeapNode(arr.get(i).get(0),i,0));
        }
        while(! pq.isEmpty()){
            HeapNode ele = pq.poll();
            res.add(ele.val);
            int apos = ele.apos;
            int vpos = ele.vpos;
            if(vpos+1<arr.get(apos).size()){
                pq.add(new HeapNode(arr.get(apos).get(vpos+1),apos,vpos+1));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
    }
}
