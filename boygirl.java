import java.util.*;

public class boygirl {
    public static int countDifferentCharacters(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
                     char ch = Character.toLowerCase(s.charAt(i));
            int index = ch - 'a';

            if (index >= 0 && index < 26 && !seen[index]) {
                seen[index] = true;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int distinct = countDifferentCharacters(s);

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
