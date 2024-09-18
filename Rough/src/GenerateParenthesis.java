import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        generate("",n,0,0);
        
    }
    public static void generate(String ans , int n ,int cnt1 , int cnt2) {
        if (cnt1 == n && cnt2 == n) {
            System.out.println(ans);
        }
        if (cnt1 > n || cnt2 > n) return;
        if(cnt2<cnt1) generate(ans+")",n,cnt1,cnt2+1);
        generate(ans+"(",n,cnt1+1,cnt2);
    }
}
