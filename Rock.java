// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    String personPlay;    //User's play -- "R", "P", or "S"
    String computerPlay = "";  //Computer's play -- "R", "P", or "S"
    int computerInt;      //Randomly generated number used to determine computer's play
                            
    public void playGame() {
        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        getPlayerPlay();
        
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        //Print computer's play
        getComputerPlay();
        
        //See who won
        //Print winner and why
        getWinner();
        
    }
    public void getPlayerPlay(){
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter your play: ");
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase();
    }
    public void getComputerPlay(){
        Random generator = new Random();
        computerInt = generator.nextInt(3) + 0;
        if (computerInt == 1){
            computerPlay = "R";
        }
        if (computerInt == 2){
            computerPlay = "P";
        }
        if (computerInt == 3){
            computerPlay = "S";
        }
        System.out.println ("Computer Play is:  " + computerPlay);
    }
    public void getWinner(){
        if (computerPlay.equals("R") && personPlay.equals("R")) {
            System.out.println ("Rock and rock... it is a tie!");
        }
        if (computerPlay.equals("P") && personPlay.equals("P")) {
            System.out.println ("Paper and paper... it is a tie!");
        }
        if (computerPlay.equals("S") && personPlay.equals("S")) {
            System.out.println ("Scissors and scissors... it is a tie!");
        }
        if (computerPlay.equals("R") && personPlay.equals("S")) {
            System.out.println ("Rock crushes scissors... you lose!");
        }
        if (computerPlay.equals("S") && personPlay.equals("R")) {
            System.out.println ("Rock crushes scissors... you win!");
        }
        if (computerPlay.equals("R") && personPlay.equals("P")) {
            System.out.println ("Paper covers rock... you win!");
        }
        if (computerPlay.equals("P") && personPlay.equals("R")) {
            System.out.println ("Paper covers rock... you lose!");
        }
        if (computerPlay.equals("P") && personPlay.equals("S")) {
            System.out.println ("Scissors cut paper... you win!");
        }
        if (computerPlay.equals("S") && personPlay.equals("P")) {
            System.out.println ("Scissors cut paper... you lose!");
        }
    }
}
