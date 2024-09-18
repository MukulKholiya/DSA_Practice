import java.util.*;
public class shortestPath {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int[] result = BA_Count(s);
        int[] result1 = AB_Count(s);
        int cnt1 = result[0];// BA count
        int cnt2 = result[1];// Ab after Ba count
        int cnt3 = result1[0];// AB count
        int cnt4 = result1[1];// Ba after Ab count


    }

    public static int[] BA_Count(String s) {
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == 'a') {
                if (!st.isEmpty() && st.peek() == 'b') {
                    st.pop();
                    cnt++;
                } else {
                    st.push(i);
                }
            } else {
                st.push(i);
            }

        }
//        System.out.println(st);
        StringBuilder temp = new StringBuilder();
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        temp.reverse();
        String result = temp.toString();
        System.out.println(result);
        int cnt1 = 0;
        Stack<Character> stt = new Stack<>();
        for (char i : result.toCharArray()) {
            if (i == 'b') {
                if (!stt.isEmpty() && stt.peek() == 'a') {
                    stt.pop();
                    cnt1++;
                } else {
                    stt.push(i);
                }
            } else {
                stt.push(i);
            }

        }
        return new int[]{cnt, cnt1};
    }

    public static int[] AB_Count(String s) {
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == 'b') {
                if (!st.isEmpty() && st.peek() == 'a') {
                    st.pop();
                    cnt++;
                } else {
                    st.push(i);
                }
            } else {
                st.push(i);
            }

        }
//        System.out.println(st);
        StringBuilder temp = new StringBuilder();
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        temp.reverse();
        String result = temp.toString();
        System.out.println(result);
        int cnt1 = 0;
        Stack<Character> stt = new Stack<>();
        for (char i : result.toCharArray()) {
            if (i == 'a') {
                if (!stt.isEmpty() && stt.peek() == 'b') {
                    stt.pop();
                    cnt1++;
                } else {
                    stt.push(i);
                }
            } else {
                stt.push(i);
            }

        }
        return new int[]{cnt, cnt1};
    }
}
