import javax.swing.JOptionPane;
	public class Lab5{
		public static void main (String [] args) {
		
			int dailyRate = 500;
			int philHealth = 220;
			int SSS = 330;
			int no_daysWorked = 30;
				
			String Em_name = JOptionPane.showInputDialog("Enter Employee Full Name");
			Integer daysWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Days Worked"));
			
			double salarymonthly = (dailyRate * daysWorked) - (SSS + philHealth);
			
			String Payroll = ("PAY SLIP \n\n" + "Employee Name: " + Em_name + "\n Monthly Salary: " + salarymonthly + "pesos");
			
			JOptionPane.showMessageDialog(null,Payroll);
			
		}
	}