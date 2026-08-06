import java.util.Scanner;

public class SoldierAndBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(),
         n = scanner.nextInt(),
         w = scanner.nextInt();

        int totalCost = k * (w * (w + 1)) / 2;
        int amountToBorrow = totalCost - n;

        if (amountToBorrow > 0) {
            System.out.println(amountToBorrow);
        } else {
            System.out.println(0);
        }
    }
    
}
