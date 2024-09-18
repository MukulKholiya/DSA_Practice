import java.util.*;
public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        next(arr);
    }
    public static void next(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < 2*arr.length; i++) {
            while(!st.isEmpty() && arr[(i%arr.length)]>arr[st.peek()]){
                ans[st.pop()] = arr[(i%arr.length)];
            }
            st.push((i%arr.length));
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
