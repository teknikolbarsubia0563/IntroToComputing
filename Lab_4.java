import javax.swing.JOptionPane;
public class Lab_4 {
    public static void main(String args[]) {
        String repeat;

        do {
            double num;
            do {
                num = 0; // Initialize num to 0
                try {
                    num = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
                    break; // Exit the loop if parsing is successful
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            } while (true);

            if (num > 0) {
                JOptionPane.showMessageDialog(null, num + " is Positive.");
            } else if (num < 0) {
                JOptionPane.showMessageDialog(null, num + " is Negative.");
            } else {
                JOptionPane.showMessageDialog(null, num + " is Zero.");
            }

            repeat = JOptionPane.showInputDialog("Do you want to try again? (Yes or No)");
        } while (repeat != null && repeat.equalsIgnoreCase("Yes"));
    }
}
