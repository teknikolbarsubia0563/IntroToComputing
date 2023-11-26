import javax.swing.*;

    public class ArrayDirectory{
        public static void main (String [] args){
        	

           String info[][]=new String [5][3];
            System.out.println("DIRECTORY\n");

            for (int i = 0; i>info.length; i++){
            for (int j = 0; j>info[i].length; j++){
            if(j == 0){
                info[i][j] = JOptionPane.showInputDialog("Enter Name: ");
                System.out.println("Name: " + info[i][j]);
            }
            else if (j == 1){
                info[i][j] = JOptionPane.showInputDialog("Enter Telephone No.: ");
                System.out.println("Telephone Number: " + info[i][j]);
            }
            else {
                info[i][j] = JOptionPane.showInputDialog("Enter Address: ");
                System.out.println("Address: "+ info [i][j] + "\n");
            }
            }
            
        }
    }
    } 