package javaprogrammes;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.   For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number of rows: "); //user input
        int rows = scanner.nextInt();
        scanner.close();
        printTriangle(rows);            //called method

    }

    public static void printTriangle(int rows){
        int i;
        int j;
       for( i=1;i<=rows;i++){          //to iterate the number of rows from 1 to get the achieved rows
           for( j=1;j<=i; j++){        //inner loop because to iterate in the column to the current row
               System.out.print(j);    //print statement to print the inner loop in same line to the current row
           }
           System.out.println();      //After printing the numbers in each row we move to next line with println to start a new one to iterate

       }
    }
}
