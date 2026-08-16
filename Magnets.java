import java.util.*;

public class Magnets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] magnets = new int[n];
        for(int i=0; i<n;i++){
            magnets[i]=sc.nextInt();
        }
        int maxcount=1;
        int count=1;

        for(int i=0; i<n-1;i++){
            if(magnets[i]!=magnets[i+1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        System.out.println(maxcount);
    }
    
}
