import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random (); 

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("I've selected a random number between 1-10. Can you guess it?");

        int guess = 0;
        int randomNumber = random.nextInt(10) + 1;
        int attempt = 1; 
        String answer = "";
                do {
            System.out.print("\nPlease Enter your Guess: ");
                answer = input.nextLine();

            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("\nThe guess should be between 1 and 10.");
                } else if (guess < randomNumber) {
                    System.out.println("\nToo low");
                } else if (guess > randomNumber) {
                    System.out.println("\nToo high");
                } else {
                    System.out.println("\nCorrect! Congratulations, you guessed the number in " + attempt + " attempt(s).");
                }
            } else {
                input.next();
                System.out.println("\nInvalid input. Please enter a valid number.");
            }

            attempt++;
        } while (guess != randomNumber);

        input.close();
    }
}
