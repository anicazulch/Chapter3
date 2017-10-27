// ****************************************************************
//   MultiplicationTable.java
//
//   Creates a 12 by 12 multiplication table
//              
// ****************************************************************
import java.util.Scanner;
 
public class MultiplicationTable
{
    int rowNumber = 1;
    int columnNumber = 0;
    public void multiply() {
        while (rowNumber <= 12){
            for(int i = 0; i < 12; i++) {
                columnNumber++;
                System.out.print(rowNumber*columnNumber + "\t");
            }
            rowNumber++;
            columnNumber = 0;
            System.out.println();
        }
        
    }
    }
    