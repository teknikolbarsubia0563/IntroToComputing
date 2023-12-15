import javax.swing.JOptionPane;

public class Num3word {
    public static void main(String[] args) {
        // Prompt the user for input
        String input = JOptionPane.showInputDialog("Enter a whole number between 0 and 10:");

        try {
            // Convert the input to an integer
            int number = Integer.parseInt(input);

            // Check if the number is in the range 0-10
            if (number >= 0 && number <= 10) {
                // Convert the number to words using if-else-if
                String numberInWords;
                if (number == 0) {
                    numberInWords = "Zero";
                } else if (number == 1) {
                    numberInWords = "One";
                } else if (number == 2) {
                    numberInWords = "Two";
                } else if (number == 3) {
                    numberInWords = "Three";
                } else if (number == 4) {
                    numberInWords = "Four";
                } else if (number == 5) {
                    numberInWords = "Five";
                } else if (number == 6) {
                    numberInWords = "Six";
                } else if (number == 7) {
                    numberInWords = "Seven";
                } else if (number == 8) {
                    numberInWords = "Eight";
                } else if (number == 9) {
                    numberInWords = "Nine";
                } else {
                    numberInWords = "Ten";
                }

                // Display the result
                JOptionPane.showMessageDialog(null, "Number in words: " + numberInWords);
            } else {
                // Number is not in the range
                JOptionPane.showMessageDialog(null, "Error: Number not in range.");
            }
        } catch (NumberFormatException e) {
            // Input is not a valid number
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a valid number.");
        }
    }
}
