import java.util.Objects;

public class hackerrank {
    public static void main(String[] args) {
        subseq("abba","",0,"ab");
        System.out.println(cnt);


    }
    static int cnt=0;
    public static void subseq(String s,String ans,int i,String newName){
        // int flag=0;
        if(i==s.length()){
            if(Objects.equals(ans, newName)){
                System.out.println(ans);
                cnt+=1;
            }
            return;
        }

        char a = s.charAt(i);
        // for(int k=0 ; k<s.length(); k++){
        //     if(s.charAt(k)==a){
        //         flag=1;
        //         break;
        //     }
        // }
        // if(flag==0){
        subseq(s,ans,i+1,newName);
        subseq(s,ans+a,i+1,newName);
        // }


    }

}
