// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    int numToGuess;           //Number the user tries to guess
    int guess;                //The user's guess
    int guessCount;           //The number of times the user guessed
    public void guessGame() {
        {
          //randomly generate the number to guess
          getComputerGuess();
          
          //print message asking user to enter a guess
          getUserGuess();
          
          //read in guess
          keepGuessing();          
          
          //print message saying guess is right
          printMessage();
        }
    }
    public void getComputerGuess(){
        Random generator = new Random();
        numToGuess = generator.nextInt(10) + 0;
    }
    public void getUserGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter your guess: ");
        guess = scan.nextInt();
    }
    public void keepGuessing(){
        while (numToGuess != guess )  //keep going as long as the guess is wrong
            {
                //print message saying guess is wrong
                System.out.println("You're wrong. Guess again");
                //prints whether it's too high or too low
                if (guess > numToGuess){
                    System.out.println("Your number is too high");
                }
                else {
                    System.out.println("Your number is too low");
                }
                //get another guess from the user
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter in another guess: ");
                guess = scan.nextInt();
                guessCount += 1;
          }
    }
    public void printMessage(){
        if (numToGuess == guess) {
            System.out.println("You got it! The number was " + numToGuess + ".");
            System.out.println("You guessed " + guessCount + " times.");
        }
    }
}
