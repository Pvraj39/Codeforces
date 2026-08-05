import java.util.*;

public class easy {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            if(arr[i]==1){
                count+=1;
           }
            else{
                count+=0;
            }
        }
        if(count==0){
         System.out.print("easy");k
        }
        else{
        System.out.print("hard");
        }
        
        sc.close();
    }
}   

