import java.util.*;

public class SoftDrinking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl =sc.nextInt();
        int np=sc.nextInt();  
        
        int X=k*l;
        int Y=X/nl;
        int Z=c*d;
        int A=p/np;

        int B=Math.min(A, Math.min(Y, Z));
        int C=B/n;
    
        System.out.println(C);
        

    }
}