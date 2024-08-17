import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int roundsWon = 0;
        while (playAgain){
            int numberToGuess = random.nextInt(100)  + 1;
            int attempts = 0;
            guessedCorrectly = false;
            System.out.println("Guess the number between 1 and 100. You have 10 attempts");
            while(attempts< 10 && !guessedCorrectly){
                System.out.print("Enter your guess:");
                int userGuess = sacnner.nextInt();
                attempts++;
                if(userGuess == numberToGuess){
                    System.out.println("Correct! You have guessed the number.");
                    guessedCorrectly = true;

                }
                else if (userGuess < numberToGuess){
                    System.out.println("Too low. Try again");
                }
                else{
                    System.out.println("Too high. Try again");
                }

            }
            if(! guessedCorrectly){
                System.out.println("Sorry you have used all your attempts. The number was " + numberToGuess + ".");
            }
            else{
                roundsWon++;
            }
                System.out.println("Do you want to play again? (yes/no):");
                String response = scanner.next().toLowerCase();
                playAgain = response.equals("yes");
            }
            System.out.println("Game over. You won " + roundsWon + " rounds.");
            scanner.close();
    


        
    }
}