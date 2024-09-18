import java.util.*;
public class ReplaceZerosWithFive {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        replace(s,"",0);
    }
    public static void replace(String s , String ans , int i){
        if(i==s.length()){
            System.out.println(Integer.parseInt(ans));
            return;
        }
        if(s.charAt(i)=='0'){
            replace(s,ans+'5',i+1);
        }
        else{
            replace(s,ans+s.charAt(i),i+1);
        }

    }
}
