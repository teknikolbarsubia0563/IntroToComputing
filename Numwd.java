import javax.swing.JOptionPane;

public class Numwd {
    public static void main(String[] args) {
        String numberInWords = "";
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a whole number from 0-10: ", "NUMBER", JOptionPane.PLAIN_MESSAGE));

        if (num == 0) {
            numberInWords = "ZERO";
        } else if (num == 1) {
            numberInWords = "ONE";
        } else if (num == 2) {
            numberInWords = "TWO";
        } else if (num == 3) {
            numberInWords = "THREE";
        } else if (num == 4) {
            numberInWords = "FOUR";
        } else if (num == 5) {
            numberInWords = "FIVE";
        } else if (num == 6) {
            numberInWords = "SIX";
        } else if (num == 7) {
            numberInWords = "SEVEN";
        } else if (num == 8) {
            numberInWords = "EIGHT";
        } else if (num == 9) {
            numberInWords = "NINE";
        } else if (num == 10) {
            numberInWords = "TEN";
        } else {
            numberInWords = "ERROR: Number not in range.";
        }

        JOptionPane.showMessageDialog(null, numberInWords, "NUMBER IN WORDS", 1);
    }
}
