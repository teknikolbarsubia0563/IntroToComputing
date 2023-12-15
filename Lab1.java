import javax.swing.JOptionPane;
public class Lab1 {
	public static void main (String [] args) {
		int num1, num2, num3, num4, num5,sum;
		double average;
		
		JOptionPane.showMessageDialog(null,"INPUT 5 NUMBERS:");
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fourth number: "));
		num5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fifth number: "));
		
		sum = num1 + num2 + num3 + num4 + num5 ;
		average = (num1+num2+num3+num4+num5)/5;
		
			JOptionPane.showMessageDialog(null,"First number: " + num1 + "\n" + "Second number: " + num2 + "\n" + "Third number: " + num3 + "\n" + "Fourth number: " + num4 + "\n" + "Fifth number: " + num5 + "\n" + "Sum: " + sum + "\n" + "Average: " + average); 	
			
	}
}