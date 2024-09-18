import java.util.*;
public class test2Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> ll = new ArrayList<>();
        print(s,"",s,ll);
        for (int i = 0; i < ll.size(); i++) {
            if(s.compareTo(ll.get(i))<0){
                System.out.print(ll.get(i)+" ");
            }
        }
    }
    public static void print(String s,String ans,String q,List<String> ll){
        if(q.isEmpty()){
            ll.add(ans);
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            String n = q.substring(0,i)+q.substring(i+1);
            if(Character.toLowerCase(ch)==Character.toUpperCase(ch)){
                print(s,ans+Character.toUpperCase(ch),n,ll);

            }
            else{
                print(s,ans+Character.toUpperCase(ch),n,ll);
                print(s,ans+Character.toLowerCase(ch),n,ll);
            }

        }
    }
}
