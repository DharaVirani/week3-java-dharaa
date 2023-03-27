package javaprogrammes;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

public class Program15 {
    public static void printTriangle(int rows){  //static method with 1 param
        for(int i=1;i<=rows; i++){               //for loop which initialized with 1
         for(int j=1;j<=i;j++){                  //inner for loop for columnar increment
             System.out.print("*");              //printing star columnar increment
         }
            System.out.println();                 //After printing the numbers in each row
                                                // we move to next line with println to start a new one to iterate
        }
    }

    public static void main(String[] args) {
//        Reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        printTriangle(rows);    //called static method
    }
}
