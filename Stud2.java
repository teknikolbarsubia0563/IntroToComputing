import javax.swing.JOptionPane;
	public class Stud2{
		public static void main(String [] args) {
			
			String Stud_name = JOptionPane.showInputDialog("Student Name: ");
			String Email_ad = JOptionPane.showInputDialog("Email address: ");
			String Contact_num = JOptionPane.showInputDialog("Enter 11 Digit Contact Number: ");
			String Home_ad = JOptionPane.showInputDialog("Full Home Address: ");
			String Id_num = JOptionPane.showInputDialog("Enter ID Number: ");
			
			String info = ("Student Name: " + Stud_name + "\nEmail Address: " + Email_ad + "\nContact Number: " + Contact_num + "\nHome Address: " + Home_ad + "ID number: " + Id_num);
			JOptionPane.showMessageDialog(null,info);
		}
			
	}
