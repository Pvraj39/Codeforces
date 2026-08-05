import java.util.*;

public class Friendship {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int antonCount = 0;
        int danikCount = 0;

        for(char c : s.toCharArray()){
            if(c == 'A') antonCount++;
            else if(c == 'D') danikCount++;
        }

        if (antonCount == danikCount) {
            System.out.println("Friendship");
        } else if (antonCount > danikCount) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }

        sc.close();
    }
}