import javax.swing.JOptionPane;
public class testlab4 {
    public static void main (String args []){

    String repeat = "";
    do{
    double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));

    if (num > 0){
        JOptionPane.showMessageDialog(null, num + " " + "is Positive.");
    }
    else if (num < 0){
        JOptionPane.showMessageDialog(null,num + " " + "is Negative.");
    }
    else 
        JOptionPane.showMessageDialog(null, num + "is Zero.");
        
        repeat = JOptionPane.showInputDialog(null, "Do you want to try again?" + "Yes or No?");}

        while (repeat.equalsIgnoreCase("Yes"));
    }
}

