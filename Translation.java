import java.util.*;

public class Translation {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String t= sc.nextLine();
        String reversed = new StringBuilder(c).reverse().toString();

        if(reversed.equals(t)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
