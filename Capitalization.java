import java.util.*;

public class Capitalization {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Capitalize the first letter and make the rest lowercase
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);

        System.out.println(result);
    }
    
}
