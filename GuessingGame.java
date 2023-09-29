import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfGuesses = 0;
        int userScore = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have 10 attempts to guess it.");
        
        while (numberOfGuesses < 10) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
                continue;
            }
            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                userScore++;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number. Guesses left: " + (10 - numberOfGuesses));
            } else {
                System.out.println("Try a lower number. Guesses left: " + (10 - numberOfGuesses));
            }
        }
        
        System.out.println("Game over! Your score is: " + userScore);
        
        scanner.close();
    }
}
