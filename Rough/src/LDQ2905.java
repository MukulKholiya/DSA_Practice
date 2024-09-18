public class LDQ2905 {
    public static void main(String[] args) {
        String s = "10";
        int mk = decimal(s);
        int cnt = 0;
        while(mk!=1){
            if(mk%2==0){
                mk/=2;
            }
            else{
                mk+=1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
    public static int decimal(String s){
        int sum = 0;
        int l = s.length()-1;
        for(char ch : s.toCharArray()){
            sum+= (int) (Math.pow(2,l)* (int)(ch-'0'));
//            System.out.println(sum);
            l--;
        }
        return sum;
    }
}
