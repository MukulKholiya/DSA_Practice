import java.util.*;

public class todayQuestion {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("c");
        ls.add("b");
//        System.out.println(replace("is",ls));
        String sentence = "aadsfasf absbs bbab cadsfafs";
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String s : words){
            String ref = replace(s,ls);
            ans.append(ref).append(" ");
        }
        System.out.println(ans);

    }
    public static String replace(String s , List<String> dictionary){
        StringBuilder sd = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            sd.append(s.charAt(i));
            String k = sd.toString();
            if(dictionary.contains(k)) return k;
        }
        return s;
    }
}
