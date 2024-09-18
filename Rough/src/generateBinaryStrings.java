import java.util.*;
public class generateBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "1??0?101";
        print("",s,0);
    }
    public static void print(String ans , String s , int i){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }
        if(s.charAt(i)=='?'){
            print(ans+"0",s,i+1);
            print(ans+"1",s,i+1);
        }
        else print(ans+s.charAt(i),s,i+1);

    }
}
