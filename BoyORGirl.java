import java.util.*;
public class BoyORGirl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str =sc.next();

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        int n= set.size();
        int  Even= n%2;
        if(Even==0){ 
        System.out.println("CHAT WITH HER!");
        }
        else{
          System.out.println("IGNORE HIM!" );
  
        }
    }
}
    

