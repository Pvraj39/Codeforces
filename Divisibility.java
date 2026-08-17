import java.util.*;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            map.put(a, b);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a = entry.getKey();
            int b = entry.getValue();

            int count = (b - (a % b)) % b;

            System.out.println(count);
        }

        sc.close();
    }
}