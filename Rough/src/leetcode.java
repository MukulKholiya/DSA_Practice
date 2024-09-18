public class leetcode {
    public static void main(String[] args) {
        String[] words = {"a","abb"};
        int cnt = 0;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if(isItTrue(words[i],words[j])) cnt++;
            }
        }
        System.out.println(cnt);


    }
   public static boolean isItTrue(String str1, String str2){
        if(str1.length()>str2.length()) return false;
       for (int i = 0; i < str1.length(); i++) {
           if(str1.charAt(i)!=str2.charAt(i)) return false;
       }
       int j = str1.length()-1;
       int k = str2.length()-1;
       while(j>=0){
           if(str1.charAt(j)!=str2.charAt(k)) return false;
           k--;
           j--;
       }
       return true;
   }
}
