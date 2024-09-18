import java.util.*;
public class largestRectagleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,1,13};
        rectangle(arr);
    }
    public static void rectangle(int[] arr){
        Stack<Integer> st = new Stack<>();
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h = arr[st.pop()];
                if(!st.isEmpty()){
                    int l = st.peek();
                    area = Math.max(area,h*(i -l-1));
                }
                else{
                    area = Math.max(area,h*i);
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            int h = arr[st.pop()];
            if(!st.isEmpty()){
                int l = st.peek();
                area = Math.max(area,h*(r-l-1));
            }
            else{
                area = Math.max(area,h*r);
            }
        }
        System.out.println(area);
    }
}
