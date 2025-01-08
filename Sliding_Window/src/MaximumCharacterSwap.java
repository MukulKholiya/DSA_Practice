public class MaximumCharacterSwap {
    public static void main(String[] args) {
        String s = "aabababbabbabaaaa";
        int k = 2;
        int flip_a = maxLen(s,k,'a');
        int flip_b = maxLen(s,k,'b');
        System.out.println(Math.max(flip_a,flip_b));

    }
    public static int maxLen(String s,int k,char ch){
        int si = 0, ei = 0, flip = 0, ans = 0;
        while(ei<s.length()){
            if(s.charAt(ei)==ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(si)==ch)flip--;
                si++;
            }
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
