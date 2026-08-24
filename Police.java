
import java.util.*;
public class Police {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == -1) {
                if (sum > 0) {
                    sum--;
                } else {
                    c++;
                }
            } else {
                sum += arr[i];
            }
        }

        System.out.print(c);
    }
}