import java.util.*;

public class UltraMath {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String n1= sc.nextLine();
        String n2= sc.nextLine();
        int num1 = Integer.parseInt(n1, 2);
        int num2 = Integer.parseInt(n2, 2);
        int result = num1 ^ num2;
        String binaryResult = Integer.toBinaryString(result);
        System.out.println(binaryResult);
        sc.close();
    }
    
}
