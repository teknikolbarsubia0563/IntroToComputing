import javax.swing.JOptionPane;
public class Lab_5 {
    public static void main (String [] args){

        int sizeArray = Integer.parseInt(JOptionPane.showInputDialog("Enter number of array: "));
        String name[] = new String[sizeArray];

        for(int i = 0; i<name.length; i++){
        name [i] = JOptionPane.showInputDialog("Enter name: ");}

        for(int show = 0; show<name.length; show++){
        JOptionPane.showMessageDialog(null, "Name: "+ " " + name[show]);}

    }
}
