import java.util.*;

public class Lucky{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          
        for (int i = 0; i < n; i++) {
            String num = sc.next(); 
                int sum1=0;
                int sum2=0;
                ArrayList<Integer> arr = new ArrayList<>();

            for (char ch : num.toCharArray()) {
                int digit = Character.getNumericValue(ch);
                arr.add(digit);
            }
            
            
                sum1 = arr.get(0) + arr.get(1) + arr.get(2);
                sum2=arr.get(3) + arr.get(4) + arr.get(5);

                if(sum1==sum2){
                    System.out.println("YES");
                }
                else{
                  System.out.println("NO");   
                }
            

                
            }
            
        }                
    }
