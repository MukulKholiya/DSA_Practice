import java.util.*;
public class letterCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        letterCombination(s,"");
        System.out.println();
        System.out.println(cnt);

    }
    static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int cnt = 0;
    public static void letterCombination(String digit, String ans) {
        if (digit.length() == 0) {
            cnt++;
            // System.out.println(ans);
            System.out.print(ans+" ");

            return;
        }

        char ch = digit.charAt(0);
        String st = arr[ch - '0'];
        for (int i = 0; i < st.length(); i++) {

            letterCombination(digit.substring(1), ans + st.charAt(i));
        }

    }
}
