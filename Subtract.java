import java.util.*;


public class Subtract {


     public static boolean endsWithDigit(int n, int targetDigit) {
        int lastDigit = Math.abs(n) % 10;

        
        return lastDigit == targetDigit;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k= sc.nextInt();
        int count =k;
      
     while (count>0) {
    if (endsWithDigit(n, 0)) {
        n = n / 10;
    } 
    else {
        n = n - 1;
    }
    count--;
}

        System.out.print(n) ;
       sc.close();
      
     }
      } 
      
