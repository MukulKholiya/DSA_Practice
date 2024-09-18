public class ReplaceAllpi {
    public static void main(String[] args) {
        String s = "3xpix4";
        print("",s,0);
    }
    public static void print(String ans,String s ,int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)=='p'&& s.charAt(i+1)=='i'){
            print(ans+"3.14",s,i+2);
        }
        else print(ans+s.charAt(i),s,i+1);
    }
}
