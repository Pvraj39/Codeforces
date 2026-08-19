import java.util.*;

public class Horseshoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;

        if (a == b)
            count++;

        if (c == a || c == b)
            count++;

        if (d == a || d == b || d == c)
            count++;

        System.out.println(count);

        sc.close();
    }
}