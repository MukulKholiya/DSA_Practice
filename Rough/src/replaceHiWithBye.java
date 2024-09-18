public class replaceHiWithBye {
    public static void main(String[] args) {
        String s = "abchihitfhi";
        String ans="",ans2="";
        System.out.println(count(s));
        print("",s,0,"");

//        System.out.println(ans);
//        System.out.println(ans2);
    }
    public static int count(String s){
        int cnt = 0;
        for(int i=0 ; i<s.length()-2 ; i++){
            if(s.charAt(i)=='h' && s.charAt(i+1)=='i' && s.charAt(i+2)!='t') cnt++;
        }
        return cnt;
    }

    public static void print(String ans,String s, int i,String ans2){
        if(i-2==s.length()){

//            System.out.println(cnt);
            System.out.println(ans2);
           System.out.println(ans);

            return;

        }
        if((s.charAt(i) == 'h') && (s.charAt(i + 1) == 'i') && (s.charAt(i+2)!='t')){
            print(ans+"bye",s,i+2,ans2);
        }
        else print(ans+s.charAt(i),s,i+1,ans2+s.charAt(i));
    }

}
