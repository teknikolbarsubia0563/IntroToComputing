import javax.swing.JOptionPane;
public class Nested {
	public static void main (String[] args) {
		int choice;
		int selects;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog("Select Genre: \n1 - horror \n 2 - romcom"));
		
		switch (choice){
			case 1: selects = Integer.parseInt(JOptionPane.showInputDialog("Select Title: \n a-Basta 1\n bBasta2"));
			switch (selects){
				case 1: JOptionPane.showMessageDialog(null, "You selected Horror 1");
				break;
				case 2: JOptionPane.showMessageDialog(null, "You selected Horror 2");
				break;
				default: 
					JOptionPane.showMessageDialog(null, "NITL");
			}
			break;
			case 2: selects = Integer.parseInt(JOptionPane.showInputDialog("Select Title: \n Rom com-1\n Romcom2"));
			switch (selects){
				case 1: JOptionPane.showMessageDialog(null, "You selected Romcom 1");
				break;
				case 2: JOptionPane.showMessageDialog(null, "You selected Romcom 2");
				break;
					default: 
					JOptionPane.showMessageDialog(null, "NITL");
			}
			break;
			
			default:
					JOptionPane.showMessageDialog(null, "NITL");
		}

		
}
}