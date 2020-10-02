package Shapes;

import java.util.Scanner;
import java.util.Arrays;

public class Shapes {
    public static void main(String[] args) {
        //initialization variables and Scanner
        Scanner input = new Scanner(System.in);

        String unknownShape;
        String boxShape = "Box";
        String xShape = "X";
        String squareWithXShape = "Box with X";
        int numInRows, numInColumns;

        //start program
        //desc of program
        System.out.println("This program will draw a shape for the user\nbased on the option they pick.\n\n");

        System.out.println("What shape would you like to draw?\n");
        System.out.println("1. Box");
        System.out.println("2. X");
        System.out.println("3. Box with X");
        unknownShape = input.nextLine();

        System.out.println("How many rows?");
        numInRows = input.nextInt();
        System.out.println("How many columns?");
        numInColumns = input.nextInt();

        while(numInRows!=numInColumns) {
            System.out.println("This will be a square grid. Please enter the same number for both rows and columns.\n");
          
            System.out.println("How many rows?");
            numInRows = input.nextInt();
  
            System.out.println("How many columns?");
            numInColumns = input.nextInt();
        }

        if (unknownShape.equals(boxShape)) {
            System.out.println("You have decided the Box Shape with " + numInRows + " rows and " + numInColumns + " columns");

            
            
        }
        else if (unknownShape.equals(xShape)) {
            System.out.println("You have decided the X Shape with " + numInRows + " rows and " + numInColumns + " columns");

            String[][] array = new String[numInRows][numInColumns];

            // blank slate
            for (int i = 0; (i < numInRows); i++) {
                for (int k = 0; k < numInColumns; k++) {
                 array[i][k] = " ";
               }
            }
              
            //diagonal line
              for (int i = 0; i < numInRows; i++) {
                 array[i][i] = "X";
                }
            
            //opposite diagonal

            for(int i = 0, k = numInRows - 1; i < numInRows ;i++, k--) {
                array[i][k] = "X";
            }
              
            // This code is for printing it all out
            for (int i = 0; i < numInRows; i++) {
                System.out.print(Arrays.toString(array[i]) + "\n");
            }
            


        }
        else if (unknownShape.equals(squareWithXShape)) {
            System.out.println("You have decided the Box with X Shape with " + numInRows + " rows and " + numInColumns + " columns");

            

        }
        else {
           System.out.println("You have entered invalid input.");
        }

        
    }
}
