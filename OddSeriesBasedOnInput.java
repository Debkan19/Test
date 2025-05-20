import java.util.Scanner;

public class OddSeriesBasedOnInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        
        if (a % 2 == 0) {
            a -= 1;
        }

        
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
