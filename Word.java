import java.util.*;

public class Word {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    long up = s.chars().filter(Character::isUpperCase).count();
    long low = s.chars().filter(Character::isLowerCase).count();

    if (up > low) {
        System.out.println(s.toUpperCase());
    } else {
        System.out.println(s.toLowerCase());
    }
    
}
}
