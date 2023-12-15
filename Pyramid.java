import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        
        for (int i = 1; i <= numRows; i++) {
           
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
