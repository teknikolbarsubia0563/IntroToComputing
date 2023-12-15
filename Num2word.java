import javax.swing.JOptionPane;
public class Num2word {
        public static void main (String[]args){
         String input = JOptionPane.showInputDialog("Enter a whole number between 0 and 10: ", "NUMBER",JOptionPane.PLAIN_MESSAGE);

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a whole number.");
            return;
        }

        
        if (number >= 0 && number <= 10) {
            
            String numberWords = convertToWords(number);
            JOptionPane.showMessageDialog(null, "Number in words: " + numberWords);
        } else {
            
            JOptionPane.showMessageDialog(null, "Error: Number not in range.");
        }
    }

    public static String convertToWords(int number) {
        String[] words = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
        };

        return words[number];
    }
}
