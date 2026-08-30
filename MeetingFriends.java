import java.util.*;

public class MeetingFriends{
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    int Max=Math.max(a, Math.max(b,c));
    int Min=Math.min(a, Math.min(b,c));
    int MD=Max-Min;

    System.out.print(MD);



    }   

}