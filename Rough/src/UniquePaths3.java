import java.util.*;
public class UniquePaths3 {
    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        System.out.println(reduce(n,k,0,"0"));
    }
    public static char reduce(int n , int k ,int index ,String s){
        if(index==n+1){
//            System.out.println();
            return s.charAt(k-1);
        }
        StringBuilder st = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='0'){
                st.append('0');
                st.append('1');
            }
            else{
                st.append('1');
                st.append('0');
            }
        }
        String ne = st.toString();
        char c = reduce(n,k,index+1,ne);
        return c;

    }

}
