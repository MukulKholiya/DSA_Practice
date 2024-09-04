package MonuHeap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
    public ListNode merge(ListNode[] lists){
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {

                return o1.val>o2.val?1:0;
            }
        });
        for (ListNode ll : lists){
            if(ll!=null){
                pq.add(ll);
            }
        }
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        while(!pq.isEmpty()){
            ListNode rv = pq.poll();
            Dummy.next = rv;
            Dummy = Dummy.next;
            if(rv.next != null){
                pq.add(rv.next);
            }
        }
        return temp.next;
    }
}
