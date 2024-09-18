import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        List<List<String>> lst = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        String s = "nitin";
        convert(s,ls,lst);
        System.out.println(lst);
    }
    public static void convert(String ques , List<String> ls,List<List<String>> lst ){
        if(ques.length()==0){
//            System.out.println(ans);
            lst.add(new ArrayList<>(ls));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
//            List<String> ls = new ArrayList<>();
            String st = ques.substring(0,i);
            if(isPalindrome(st)){
                ls.add(st);
                convert(ques.substring(i),ls,lst);
                ls.remove(ls.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }


        return true;
    }
}
