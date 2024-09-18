public class powInLog {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
    public static int pow(int a ,int n){
        if(n==1){
            return a;
        }
        int ans = pow(a,n/2);
        ans = ans * ans;
        if(n%2!=0) ans = ans*a;
        return ans;
    }
}
