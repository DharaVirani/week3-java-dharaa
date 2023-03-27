package javaprogrammes;
/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number of rows: ");  //reading from console how many rows they want
        int rows= scanner.nextInt();
        scanner.close();
        printTriangle(rows);            //calling static method
    }
    public static void printTriangle(int rows){
       for(int i=1;i<=rows;i++){     //outer loop iterating over the number of rows
         for(int j=1; j<=i;j++){
             System.out.print("@");  //inner loop iterating over the columns of each low printing @
         }
           System.out.println();    //to enter into the new line with println
       }
    }
}
