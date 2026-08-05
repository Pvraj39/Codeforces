import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<Character> list = new ArrayList<>();

        // Store only the digits
        for (char ch : s.toCharArray()) {
            if (ch != '+') {
                list.add(ch);
            }
        }

        // Sort the digits
        Collections.sort(list);

        // Print with '+'
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print("+");
            }
        }
    }
}