import javax.swing.JOptionPane;
public class gwa {
    public static void main (String args []){

        String remarks = " ";
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter Grade: "));

        if(grade>60){
            remarks = "You Passed :>";
        }
        else {
            remarks = " You failed :<" ;
        }

        JOptionPane.showMessageDialog(null, "Your grade is:" + " " + grade);
        JOptionPane.showMessageDialog(null,"This means that" + " " + remarks);
    }
}
