import java.util.*;

public class RestoringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int max1=Math.max(n4, n3);
        int max2=Math.max(n1, n2);
        int max3=Math.max(max1,max2);

        int a=max3-n1;
        int b=max3-n2;
        int c=max3-n3;
        int d=max3-n4;

        if(a!=0){
            System.out.print(a+" ");
        }
       if(b!=0){
            System.out.print(b+" ");
        }
        if(c!=0){
            System.out.print(c+" ");
        }
        if(d!=0){
            System.out.print(d +" ");
        }
    }
    
}
