import java.util.*;

public class stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char [] arr = new char[n];
        int count=0;

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        
        for (int i = 0; i < n; i++){
            if(arr[i]==arr[i+1]){
              count+=1;
            }
        }
        System.out.print(count);    
    }

    
}
