import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();

        int ans = str1.compareTo(str2);

        if (ans < 0)
            System.out.println("-1");
        else if (ans > 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}