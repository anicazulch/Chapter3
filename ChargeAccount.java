// ***************************************************************
//   ChargeAccount.java
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
    double previousBalance;  // costumer's previous balance
    double otherCharges;              // total amount of additional charges during the month
    double newBalance;          // total new balance including interest
    double minimumPayment = 0;        // minimum payment due
    double interest;              // interest on the account 
    public void calculateBalance() {
               // Ask user for input
               getInput();
               // Compute the interest for the month and the new balance
               computeInterest();
               // Print the results
               printResults();
            }
    public void getInput(){
          Scanner scan = new Scanner(System.in);
          System.out.print ("Enter the previous balance on the account: ");
          previousBalance = scan.nextDouble();
          System.out.print ("Enter the additional charges during the month: ");
          otherCharges = scan.nextDouble();
        }
    public void computeInterest(){
               if (previousBalance == 0){
                   interest = 0;
                }
               else {
                   interest = 0.02 * (previousBalance + otherCharges);
     
                }
               newBalance = previousBalance + otherCharges + interest;
               minimumPayment = 0.2 * newBalance;
        }
   public void printResults(){
           NumberFormat money = NumberFormat.getCurrencyInstance();
               System.out.println("CS CARD International Statement");
               System.out.println("================================");
               System.out.println();
               System.out.println("Previous Balance:           " + money.format(previousBalance));
               System.out.println("Additional Charges:         " + money.format(otherCharges));
               System.out.println("Interest:                  "    + money.format((interest) ));
               System.out.println();
               System.out.println("New Balance:              "      + money.format(newBalance));
               System.out.println();
               System.out.println("Minimum Payment:          "  + money.format(minimumPayment));
               System.out.println();
        }
    }