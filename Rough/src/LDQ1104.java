import java.util.*;
public class LDQ1104 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0};
        System.out.println(remove(arr,1));

    }
    public static String remove(int[] nums,int k){
        Stack <Integer> st = new Stack<>();
//        char[] c = new char[nums.length()-k];

        for(int i=0 ; i<nums.length ; i++){
            while(!st.isEmpty() && k!=0 && nums[i]<=nums[st.peek()]){
                    st.pop();
                    k--;
            }
            st.push(i);
        }
//        System.out.println(st);
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.append(nums[st.pop()]);
        }
        s = s.reverse();
        String str = s.toString();
        int m = Integer.parseInt(str);
        return String.valueOf(m);
    }
}
