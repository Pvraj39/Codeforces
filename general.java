import java.util.*;

public class general {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                maxIndex = i;
                break;
            }
        }

        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);

    
        if (maxIndex > minIndex) {
            swaps--;
        }

        System.out.println(swaps);
    }
}