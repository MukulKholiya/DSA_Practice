package MonuHeap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortAccToCol {
    public static void main(String[] args) {
        int[][] arr = {};
        Arrays.sort(arr,(a, b)->a[0]-b[0]);

        int room = 1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if(pq.peek()[1]>arr[i][0]){
                pq.add(arr[i]);
                room = Math.max(room,pq.size());
            }
            else{
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(room);

    }
}
