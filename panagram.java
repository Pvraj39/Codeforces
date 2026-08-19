import java.util.*;

public class panagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine().toLowerCase();

        boolean isPanagram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                isPanagram = false;
                break;
            }
        }

        if (isPanagram)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}