import java.util.*;
public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcd";
        print("",s,0);
        System.out.println();
        System.out.println(cnt);

    }
    static int cnt=0;
    public static void print(String ans , String s , int i){

        if(i==s.length()){
            System.out.print(ans+" ");
            cnt++;
            return;
        }
        char a = s.charAt(i);
        print(ans,s,i+1);
        print(ans+a,s,i+1);



    }
}
