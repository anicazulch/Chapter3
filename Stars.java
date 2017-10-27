// ****************************************************************
//   Stars.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Stars
{
    int n;
    public void printStars() {
        // prints the first pattern
        patternA();
        // print space in between
        System.out.println();
        // prints the second pattern
        patternB();
        // print space in between
        System.out.println();
        // prints the third pattern
        patternC();
        // print space in between
        System.out.println();
        // prints the fourth pattern
        patternD();
    }
    public static void printItem(String st, int num){
        for (int j = 0; j < num; j++){
            System.out.print(st);
        }
    }
    public void patternA(){
        for(int i = 0; i < 10; i++) {
            printItem("*", 10-i);
            printItem(" ", i);
            System.out.println();
        }
    }
    public void patternB(){
        for(int i = 0; i < 10; i++) {
            printItem(" ", 10-i);
            printItem("*", i);
            System.out.println();
        }
    }
    public void patternC(){
        for(int i = 0; i < 10; i++) {
            printItem(" ", i);
            printItem("*", 10-i);
            System.out.println();
        }
    }
    public void patternD(){
        
        
    }
}
