import java.util.*;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loc = sc.nextInt();

        int steps = (loc + 4) / 5;  // rounding up

        System.out.print(steps);

        sc.close();
    }
}
