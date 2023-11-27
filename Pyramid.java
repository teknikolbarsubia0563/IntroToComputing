import javax.swing.JOptionPane;

public class Pyramid {
    public static void main(String[] args) {
        // Input: Get the number of rows from the user
        String input = JOptionPane.showInputDialog("Enter the number of rows for the pyramid:");
        
        // Convert the input string to an integer
        int numRows = Integer.parseInt(input);

        // Display the pyramid
        displayPyramid(numRows);
    }

    // Function to display the pyramid
    static void displayPyramid(int numRows) {
        StringBuilder pyramid = new StringBuilder();

        for (int i = 1; i <= numRows; i++) {
            // Append spaces
            for (int j = 1; j <= numRows - i; j++) {
                pyramid.append(" ");
            }

            // Append '*' characters
            for (int k = 1; k <= i; k++) {
                pyramid.append("*");
            }

            // Append digits
            for (int l = i - 1; l >= 1; l--) {
                pyramid.append(l);
            }

            pyramid.append("\n"); // Move to the next line for the next row
        }

        // Output: Display the pyramid using a dialog box
        JOptionPane.showMessageDialog(null, pyramid.toString(), "Pyramid Pattern", JOptionPane.INFORMATION_MESSAGE);
    }
}
