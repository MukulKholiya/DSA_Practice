import java.util.Scanner;

public class findTopology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] degrees = new int[n + 1];

        int x, y;

        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            degrees[x]++;
            degrees[y]++;
        }

        int c = 2;
        int star = n - 1;
        for (int i = 1; i < n + 1; i++) {
            if (degrees[i] == 2) {
            } else if (degrees[i] == 1) {
                c--;
            } else if (m == n - 1 && degrees[i] == star) {
                System.out.println("star topology");
                return;
            } else {
                System.out.println("unknown topology");
                return;
            }
        }

        System.out.println(c == 0 ? "bus topology" : "ring topology");
    }
}