import java.util.*;
public class pattern132 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,3,2,4};
        System.out.println(Pattern132(arr2));
        
    }
    public static boolean Pattern132(int[] nums){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(st.size()>=2 && st.peek()>nums[i]){
                return true;
            }
            else if(st.isEmpty()){
                st.push(nums[i]);
            } else if (nums[i]<st.peek()) {
                st.pop();
                st.push(nums[i]);
            } else if (nums[i]>st.peek()) {
                st.push(nums[i]);
            }
        }
        return false;
    }
}
