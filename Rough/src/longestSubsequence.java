import java.util.*;
public class longestSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "lkpkxcigcs";
        int k = 6;
        int max = 0;
        print("",s,k);
        System.out.println(max);
    }
    static int max = 0;
    public static void print(String ans , String ques , int k){
        if(ques.length()==0){
            System.out.println(ans);
//            max = Math.max(max,ans.length());
//            return max;
        }

        for (int i = 0; i < ques.length(); i++) {
            if(ans.length()==0){
                print(ans+ques.charAt(i),ques.substring(i+1),k);
            }
            else if(Math.abs(ans.charAt(ans.length()-1) - ques.charAt(i))<=k){
                print(ans+ques.charAt(i),ques.substring(i+1),k);
            }
            else{
                print(ans,ques.substring(i+1),k);
            }
        }
    }
}
