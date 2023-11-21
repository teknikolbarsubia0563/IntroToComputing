import java.util.Scanner;
public class AverageArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double average;
        int sum =0;
        int ave[]=new int[13];
        System.out.println("Enter 13 integer numbers: ");

        for(int i = 0; i < 13 ; i++ ){
            ave[i]=in.nextInt();
            sum+=ave[i];
        }
        average=sum/13;
        System.out.println("The average of the number is" + " " + average);
    }
}