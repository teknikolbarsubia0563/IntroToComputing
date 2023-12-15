import javax.swing.JOptionPane;
public class Lab_5 {
    public static void main(String[] args) {
        
        int sizeArray [] =Integer.parseInt(JOptionPane.showInputDialog("Enter the size of Array: "));
       
        String name [] = new String [sizeArray];
        
        for(int i = 0; i<name.length; i++){
            name [sizeArray] = JOptionPane.showInputDialog("Enter first name: ");
        }
        JOptionPane.showMessageDialog(null,"Arrays: " + "\n" + sizeArray);
    }
}
