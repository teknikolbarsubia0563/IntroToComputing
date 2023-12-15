import javax.swing.JOptionPane;
public class Lab_3 {
	public static void main (String[]args){
		
		String Name_voter = JOptionPane.showInputDialog("Enter name: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		
		if (age>30){
			JOptionPane.showMessageDialog(null,"HELLO!" + "\nYOU ARE QUALIFIED IN BARANGAY ELECTIONS!" + Name_voter);
		}
	    else if ((age<=30)&&(age>=18)){
			JOptionPane.showMessageDialog(null,"HELLO!" + "\nYOU ARE QUALIFIED TO VOTE IN SK!" + Name_voter);
		}
		else JOptionPane.showMessageDialog(null, "HELLO!" + "\nYOU ARE NOT QUALIFIED TO VOTE!" + Name_voter);
	}
}