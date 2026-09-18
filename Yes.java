import java.util.*;

public class Yes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            String y=s.toLowerCase();
            if(y.equals("yes")){
                System.out.println("YES");

             }
             else{
                System.out.println("NO");
             }
        }

    }
}