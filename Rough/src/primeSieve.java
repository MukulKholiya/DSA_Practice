import java.util.*;
public class primeSieve {
    public static void main(String[] args) {
        int n = 100;
        Prime_Sieve(n);
    }
    // false matalab prime true matlab not prime
    public static void Prime_Sieve(int n){
        boolean[] prime = new boolean[n+1];
        prime[0] = true;// not prime
        prime[1] = true;// not prime
        for (int i = 2; i*i <= prime.length ; i++) {
            if(prime[i]==false){
                for (int j = 2; j*i < prime.length ; j++) {
                    prime[i*j] = true;
                }
            }
        }
        for (int i = 2; i <prime.length ; i++) {
            if(prime[i] == false){
                System.out.println(i+" ");
            }
        }
    }
}
