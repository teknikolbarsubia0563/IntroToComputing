import java.util.Scanner;

public class Array1 {

public static void main (String []args){
//declaring with values
        String studentNames [] = {"Sarah", "Juju", "Sammy", "Sheldon", "Lee","Dave"};
        int numbers[] = {1,2,3,4,5,6,7,8,9};

//declaring w/o values
        String employeeNames [] = new String [20];
        int evenNumbers [] = new int [10];

//Index - is a number that represents a position in a collection.
        System.out.println("----------------------------------");
        System.out.println("| Value |" + "| Sarah |" + "| Juju |");
        System.out.println("| Index |" + "|   0   |" + "|   1  |");
        System.out.println("----------------------------------");
// this is an example of Accessing Array
        // reading Array Element
        System.out.println(studentNames[1]);
        // example 2
        int number[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(numbers[2] + numbers[7]);
//this is an example of Assigning array element
      String studentName[] = {"Juju"};
      System.out.println(studentName[0]);
//Assigning Array Element w/ User input
        //syntax sample
        Scanner s = newScanner(System.in);
        names[0] = s.nextLine();
    }
}
