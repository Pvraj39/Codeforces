import java.util.*;

public class Games{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> h = new ArrayList<>();
        ArrayList<Integer> g = new ArrayList<>();
        
        for(int i=0;i<n;i++){
         int home=sc.nextInt();
         int guest=sc.nextInt();
         h.add(home);
         g.add(guest);
        }
        
        int c=0;
        for (int i = 0; i <n; i++) {
          for(int j=0; j<n;j++){
              if (h.get(i).equals(g.get(j))){
                c++;
              }
     
        }
    }
    System.out.print(c);
}
}