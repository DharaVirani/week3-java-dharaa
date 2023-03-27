package javaprogrammes;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.   While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */

public class Program14 {
    public static void main(String[] args) {
//        Reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter a symbol: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        printDiamond(rows, ch);           //called static method


    }

    public static void printDiamond(int rows, char ch) {  //static method with 2 params
        int i = 1;     //number of * in 1st row

        //print the top half of the diamond
        while (i <= rows) {                              //condition holds true till number of rows initialized mentioned
            int j = 1;                                      //inner loop columnar printing
            while (j++ <= rows - i) {
                System.out.print(" ");                      //spacing in between
            }
            j = 1;
            //inner loop 1
            while (j++ <= i * 2 - 1) {                    //prints until the condition becomes false
                System.out.print(ch);
            }
            System.out.println();                         // ending line after each row
            i++;                                         // incrementing as we want pyramid generation
        }                                                //        upper half pyramid is done}
//        We don't need to print the bottom row again for other half pyramid
//        half diamond printing
//         so variable initialized should one lesser than number of rows
        i = rows - 1;
        while (i > 0) {
            int j = 1;
            while (j++ <= rows - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--; // decrementing as we want pyramid generation

        }
    }
}

