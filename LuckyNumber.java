import java.util.*;

public class LuckyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        if(String.valueOf(n).contains("0")||String.valueOf(n).contains("1")||String.valueOf(n).contains("2")||String.valueOf(n).contains("3")||String.valueOf(n).contains("5")||String.valueOf(n).contains("6")||String.valueOf(n).contains("8")||String.valueOf(n).contains("9")){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        


    }
}