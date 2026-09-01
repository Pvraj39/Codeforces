import java.util.*;

public class LongestSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            int count = 0;
            int maxCount = 0;

            for (int j = 0; j < n; j++) {

                int x = sc.nextInt();

                if (x == 0) {
                    count++;

                    if (count > maxCount) {
                        maxCount = count;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(maxCount);
        }

        sc.close();
    }
}