import java.util.*;
public class longestSubstringWithAllVowels {
    public static void main(String[] args) {
        String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println(isBeautiful(word,0,30));
        int cnt=1;
        int len=1;
        int max_length=0;

        int n=word.length();

        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                len++;
            }else if(word.charAt(i-1)<word.charAt(i)){
                cnt++;
                len++;
            }else{
                len=1;
                cnt=1;
            }

            if(cnt==5){
                max_length=Math.max(max_length,len);
            }
        }
        System.out.println(max_length);;

    }
    public static boolean isBeautiful(String word , int i , int j){
        StringBuilder st = new StringBuilder();
        st.append(word.charAt(i));
        int index = 0;
        for (int ind = i+1; ind < j ; ind++) {
            if(word.charAt(ind)!=st.charAt(index)){
                st.append(word.charAt(ind));
                index++;
            }
        }
        return index==5;
    }
}
