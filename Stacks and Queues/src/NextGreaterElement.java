import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,6,11,9,6};
        nextLarger(arr);
    }

    public static void nextLarger(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "--->" + ans[i]);
        }
    }
}
