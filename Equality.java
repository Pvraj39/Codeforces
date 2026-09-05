import java.util.*;

public class Equality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = Arrays.stream(arr).max().getAsInt();
        for(int i=0;i<n;i++){
            count += max - arr[i];
        }
        System.out.println(count);
    }
}