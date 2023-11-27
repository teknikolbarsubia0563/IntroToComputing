import java.util.Scanner;

public class PyramidArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of levels for the pyramid
        System.out.print("Enter the number of levels for the pyramid: ");
        int numLevels = scanner.nextInt();

        // Calculate the total number of elements in the pyramid
        int totalElements = numLevels * (numLevels + 1) / 2;

        // Create an array to store the pyramid elements
        int[] pyramidArray = new int[totalElements];

        // Prompt the user to enter values for the pyramid
        System.out.println("Enter " + totalElements + " values for the pyramid:");

        // Fill the array with user input
        for (int i = 0; i < totalElements; i++) {
            pyramidArray[i] = scanner.nextInt();
        }

        // Reverse the array elements
        for (int i = 0; i < totalElements / 2; i++) {
            int temp = pyramidArray[i];
            pyramidArray[i] = pyramidArray[totalElements - i - 1];
            pyramidArray[totalElements - i - 1] = temp;
        }

        // Display the reversed array in the form of a pyramid
        int currentIndex = 0;
        for (int level = 1; level <= numLevels; level++) {
            // Print spaces for formatting
            for (int space = 0; space < numLevels - level; space++) {
                System.out.print("  ");
            }

            // Print elements for the current level
            for (int i = 0; i < level; i++) {
                System.out.print(pyramidArray[currentIndex++] + " ");
            }

            // Move to the next line after each level
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
