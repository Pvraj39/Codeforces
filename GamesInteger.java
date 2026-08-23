import java.util.*;
public class GamesInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int num = sc.nextInt();

           if((num+1)%3==0 || (num-1)%3==0){
                System.out.println("First");
            }else{
                System.out.println("Second");
           }
        }
    }
}