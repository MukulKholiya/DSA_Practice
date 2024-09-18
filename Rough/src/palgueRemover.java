public class palgueRemover {
    public static void main(String[] args){

    }
    public static void remove(int[] arr){
        int cnt = 0;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]==1) cnt++;
        }
        System.out.println(cnt);
    }
    public static void print(String s,String ans){
        for (int i = 0; i < s.length(); i++) {
            ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void grenade(int n){
        int cnt = 0;
        while(n>0){
            n--;
            cnt++;
        }
        System.out.println(cnt);


    }

}
