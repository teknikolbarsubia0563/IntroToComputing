import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        // Print the pyramid pattern
        for (int i = 1; i <= numRows; i++) {
            // Print leading spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
