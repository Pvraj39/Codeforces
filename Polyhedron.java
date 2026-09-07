import java.util.*;

public class Polyhedron{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String shape = sc.next();
            if(shape.equals("Tetrahedron")){
                count += 4;
            } else if(shape.equals("Cube")){
                count += 6;
            } else if(shape.equals("Octahedron")){
                count += 8;
            } else if(shape.equals("Dodecahedron")){
                count += 12;
            } else if(shape.equals("Icosahedron")){
                count += 20;
            }
        }
        System.out.println(count);
    }
}