import java.util.HashMap;

public class MaximumWindowSubstring {
    public static void main(String[] args) {

    }
    public static int minimumWindowSize(String s,String t){
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0 ; i<t.length() ; i++){
            char c = t.charAt(i);
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {

        }
        return 0;
    }
}
