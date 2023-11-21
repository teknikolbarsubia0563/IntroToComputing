import javax.swing.JOptionPane;
	public class Samplejava2 {
		public static void main (String[]args){
		
		String Programmer_name = JOptionPane.showInputDialog("Enter Programmer Name:");
		Integer Programmer_age = Integer.parseInt(JOptionPane.showInputDialog("Enter Programmer Age:"));
		Integer Programmer_testnumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Programmer Test Number"));
		
		String Personel_details = ("Personel Details\n" + "\nProgrammer Name:" + Programmer_name + "\nProgrammer Age:" + Programmer_age + "\nProgrammer test number:" + Programmer_testnumber);
		
		JOptionPane.showMessageDialog(null,Personel_details);
	}
}