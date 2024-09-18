import java.util.*;
public class leetcode2 {
    public static void main(String[] args) {
        char[] arr = {'2','1','+','3','*'};
        System.out.println(RPM(arr));

    }
    public static int RPM(char[] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+') {
                int a = st.pop();
                int b = st.pop();
                int i1 = b + a ;
                st.push(b+a);


            } else if (arr[i] == '-') {
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);

            } else if (arr[i] == '*') {
                int a = st.pop();
                int b = st.pop();
                st.push(b*a);

            } else if (arr[i]=='/') {
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);

            }
            else st.push(arr[i]-'0');
        }
        return st.pop();
    }
}
