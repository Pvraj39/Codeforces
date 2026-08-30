import java.util.*;

public class AB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          
        for (int i = 0; i < n; i++) {
            String num = sc.next();  // read number as string
                int sum=0;

            for (char ch : num.toCharArray()) {
                int digit = Character.getNumericValue(ch);
                 sum+=digit;
               
           }System.out.println(sum);
        }                

        
    }
    
}
