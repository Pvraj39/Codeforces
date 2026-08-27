import java.util.*;

public class Fox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        String hash = "#";
        String dot = ".";

        for (int i = 1; i <= r; i++) {

            if (i % 2 != 0) {
                System.out.println(hash.repeat(c));
            } 
            else {
                if (i % 4 == 2) {
                    System.out.println(dot.repeat(c - 1) + hash);
                } 
                else {
                    System.out.println(hash + dot.repeat(c - 1));
                }
            }
        }
    }
}