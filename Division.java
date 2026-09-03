import java.util.*;

public class Division{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int rating=sc.nextInt();

            if(1900<=rating){
                System.out.println("Division 1");
            }
            else if(1600<=rating && rating<1900){
                System.out.println("Division 2");
            }
            else if(1400<=rating && rating<1600){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
        sc.close();
    }
}