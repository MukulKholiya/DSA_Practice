import java.util.*;
public class IntegerToEnglishWords {
    public static final String[] below = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "Nineteen", "twenty"};
    public static final String[] less = {"", "", "twenty", "Thirty", "fourty", "fifty", "sixty", "seventy", "Eighty", "Ninety"};
    public static final String[] suffix = {"", "Thousand", "Million", "Billion"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(convert(n));

    }

    public static String convert(int n) {
        if (n < 20) {
            return below[n];
        } else if (n < 100) {
            return less[n / 10] + (n % 10 != 0 ? " "+ below[n % 10] : "");
        } else if (n < 1000) {
            return convert(n / 100) + " Hundred" + (n % 100 != 0 ? " " + convert(n % 100) : "");
        } else if (n < 1000000) {
            return convert(n / 1000) + " Thousand" + (n % 1000 != 0 ? " " + convert(n % 1000) : "");
        } else if (n < 1000000000) {
            return convert(n / 1000000) + " Million" + (n % 1000000 != 0 ? " " + convert(n % 1000000) : "");
        } else {
            return convert(n / 1000000000) + " Billion" + (n % 1000000000 != 0 ? " " + convert(n % 1000000000) : "");
        }
    }
    
}
