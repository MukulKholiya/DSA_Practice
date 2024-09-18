import java.util.*;
public class grumpyOwner {
    public static void main(String[] args) {
        int[] customer = {1,0,1,2,1,1,7,5};
        int[] grumpy =   {0,1,0,1,0,1,0,1};
        int minute = 3;
        System.out.println(find(customer,grumpy,minute));

    }
    public static int find(int[] customer , int[] grumpy , int minute){
        int suma = 0;
        for(int i=0 ; i<customer.length ; i++){
            if(grumpy[i]==0) suma+=customer[i];
        }
        int ans = 0;
        for(int i=0 ; i<minute ; i++){
            if(grumpy[i]==1) ans+=customer[i];
        }
        int max = ans;
        for (int i = minute; i < customer.length; i++) {
            if (grumpy[i - minute] == 1) {
                ans -= customer[i - minute];
            }
            if (grumpy[i] == 1) {
                ans += customer[i];
            }
            max = Math.max(max, ans);
        }

        return suma+max;
    }
}
