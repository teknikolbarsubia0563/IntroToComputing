import javax.swing.JOptionPane;

public class Semester {
    public static void main (String args []){
        
        String remarks = "";
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade: "));

        if(grade>=95){
            remarks = "Excellent!";
        }
        else if((grade<95)&&(grade>=84.5)){
            remarks = "Very Good!";
        }
        else if((grade<85)&&(grade>=74.5)){
            remarks = "Good";
        }
        else {
            remarks = "failed:<";
        }

        JOptionPane.showMessageDialog(null, "Your grade this semester is: " + " " + grade);
        JOptionPane.showMessageDialog(null, "Performance Rating: " + " " + remarks);
    }
}
