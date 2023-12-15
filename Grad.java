import javax.swing.JOptionPane;

public class Grad {
    public static void main(String[] args) {
        String remarks = " ";
        double CS112 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter CS 112 Grade: ", "CS 112 Grade", JOptionPane.PLAIN_MESSAGE));
        double CS113 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter CS 113 Grade: ", "CS 113 Grade", JOptionPane.PLAIN_MESSAGE));
        double CS114 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter CS 114 Grade: ", "CS 114 Grade", JOptionPane.PLAIN_MESSAGE));
        double GE1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter GE 1 Grade: ", "GE 1 Grade", JOptionPane.PLAIN_MESSAGE));
        double SocSci1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Soc Sci 1 Grade: ", "Soc Sci 1 Grade", JOptionPane.PLAIN_MESSAGE));
        double PE1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter PE 1 Grade: ", "PE 1 Grade", JOptionPane.PLAIN_MESSAGE));
        double NSTP1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter NSTP 1 Grade: ", "NSTP 1 Grade", JOptionPane.PLAIN_MESSAGE));
        
        double average = (CS112 + CS113 + CS114 + GE1 + SocSci1 + PE1 + NSTP1) / 7;
        
        if (average >= 74.5) {
            remarks = "PASSED!";
        } else {
            remarks = "FAILED!";
        }
        
        System.out.println("Your average grade for this semester is: " + average);
        System.out.println("This means you " + remarks);
    }
}
