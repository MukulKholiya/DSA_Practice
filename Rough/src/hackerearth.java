import java.util.*;

public class hackerearth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[][] price = new int[m][2];
        // Taking Input
        for (int i = 0; i < m; i++) {
            price[m][0] = sc.nextInt();
            price[m][1] = sc.nextInt();

        }
        Arrays.sort(price, Comparator.comparingInt(a -> a[0]));
        while(n>0){
            

            n--;
        }


    }
    public static int max(List<Integer> lst){
        int max = 0;
        for(int i : lst){
            max = Math.max(max,i);
        }
        return max;
    }
}
