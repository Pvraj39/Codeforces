import java.util.*;

public class Tramp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stops = sc.nextInt();

        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < stops; i++) {
            int exit = sc.nextInt();
            int entry = sc.nextInt();

            current = current - exit;
            current = current + entry;

            if (current > maxCapacity) {
                maxCapacity = current;
            }
        }

        System.out.println(maxCapacity);
    }
}