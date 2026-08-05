import java.util.*;


public class Fence{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), h = sc.nextInt();
    char arr[]= new char[n];
    int count=0;
    
     for(int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

    for (int i = 0; i < n; i++){
            if(arr[i]<=h){
              count+=1;
            }
            else{
                count+=2;
            }
        }
    System.out.print(count);     

    }  

} 
