import java.util.*;
public class mappedStrings {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String s = "123";
        print(s,"");

    }
    public static void print(String s , String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(0);
            print(s.substring(1),ans);
            print(s.substring(1),ans+ch);
        }


    }
}
