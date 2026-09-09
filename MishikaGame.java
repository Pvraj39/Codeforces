import java.util.*;

public class MishikaGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        int c=0;

        for(int i=0;i<n;i++){
            int m1= sc.nextInt();
            int m2= sc.nextInt();
            if(m1>m2){
                m++;
            }
            else if(m1<m2){
                c++;
            }
            else{
                m++;
                c++;
            }

           
        } 
        if(m>c){
                System.out.println("Mishka");
            }
            else if(m<c){
                System.out.println("Chris");
            }
            else{
                System.out.println("Friendship is magic!^^");
            }


    }
}
