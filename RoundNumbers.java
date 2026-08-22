import java.util.*;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String str = Integer.toString(n);
            int len = str.length();

            int count = 0;

            for (int i = 0; i < len; i++) {
                if (str.charAt(i) != '0') {
                    count++;
                }
            }

            System.out.println(count);

            for (int i = 0; i < len; i++) {
                int digit = str.charAt(i) - '0';

                if (digit != 0) {
                    int placeValue = digit * (int) Math.pow(10, len - i - 1);
                    System.out.print(placeValue + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}