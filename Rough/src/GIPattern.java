import java.util.*;
public class GIPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        String s =  "GGGIGGI"; //sc.next();
        int cnt = 1;
        int[] arr = new int[s.length()+1];
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='I'){
                st.push(i);
                while(!st.isEmpty()){
                    int k = st.pop();
                    arr[k] = cnt;
                    cnt++;
                }
            }
            else{
                st.push(i);
            }

        }
        arr[arr.length-1] = cnt;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
