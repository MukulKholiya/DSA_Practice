package Juspay;

import java.util.Arrays;
import java.util.Scanner;

public class NearestMeetingSelf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] edges = new int[n];
        for (int i = 0; i < n; i++) {
            edges[i] = sc.nextInt();
        }
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

    }
    public static int Nearest_Meeting(int n,int[] edges, int c1,int c2){
        long[] A = new long[n];
        long[] B = new long[n];
        Arrays.fill(A,Long.MAX_VALUE);
        Arrays.fill(B,Long.MAX_VALUE);


    }
}
