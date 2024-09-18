import java.util.*;
public class DictionarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        print(s,"");
    }
    public static void print(String s, String ans ){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);
            String rem  = s.substring(0,i) + s.substring(i+1);
            print(rem,ans+r);
        }
    }
}
