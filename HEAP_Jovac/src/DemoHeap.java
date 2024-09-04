import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoHeap {
    public static int leftChild(int x){
        return 2*x+1;
    }
    public static int rightChild(int x){
        return 2*x+2;
    }
    public static int parent(int x){
        return (x-1)/2;
    }

//    public static void heapify(List<Integer>heap ,int ind){
//        int smallest = ind;
//        int right = rightChild(ind);
//        int size = heap.size() - 1;
//        int left = leftChild(ind);
//
//        if (left <= size && heap.get(left) < heap.get(smallest)) {
//            smallest = left;
//        }
//
//        if (right <= size && heap.get(right) < heap.get(smallest)) {
//            smallest = right;
//        }
//
//        if (smallest != ind) {
//            swap(heap, ind, smallest);
//            heapify(heap, smallest);
//        }
//    }
public static void heapify(ArrayList<Integer> heap, int i) {
    int n = heap.size();
    int smallest = i; // Initialize smallest as root
    int left = 2 * i + 1; // left child
    int right = 2 * i + 2; // right child

    // If left child is smaller than root
    if (left < n && heap.get(left) < heap.get(smallest))
        smallest = left;

    // If right child is smaller than smallest so far
    if (right < n && heap.get(right) < heap.get(smallest))
        smallest = right;

    // If smallest is not root
    if (smallest != i) {
        Collections.swap(heap, i, smallest);

        // Recursively heapify the affected sub-tree
        heapify(heap, smallest);
    }
}
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void makeHeap(ArrayList<Integer> heap,int ind){
        for(int i=ind;i>=0;i--){
            heapify( heap, i);
        }
    }
    public static int extractMin(ArrayList<Integer> heap){
        int element = heap.get(0);
        swap(heap,0,heap.size()-1);
        heap.removeLast();
        heapify(heap,0);
        return element;
    }
    public static ArrayList<Integer> heapSort(ArrayList<Integer> heap) {
        ArrayList<Integer> sortedList = new ArrayList<>();

//        for (int i = heap.size() / 2 - 1; i >= 0; i--)
//            heapify(heap, i);

        while (!heap.isEmpty()) {

            Collections.swap(heap, 0, heap.size() - 1);
            sortedList.add(heap.removeLast());

            heapify(heap, 0);
        }

        return sortedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap=new ArrayList<>();
        heap.add(5);
        heap.add(10);
        heap.add(12);
        heap.add(2);
        heap.add(4);
        heap.add(1);
        heap.add(3);
        System.out.println(heap);
        int size=heap.size();
        int par=(size-2)/2;
        makeHeap(heap, par);
        System.out.println(extractMin(heap));
        System.out.println(heap);
        System.out.println(heapSort(heap));
//        System.out.println(heap);


    }


}