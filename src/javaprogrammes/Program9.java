package javaprogrammes;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Program9 {
    public static void main(String[] args) {
//        Reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input fibonacci numbers to print: ");
        int number= scanner.nextInt();
        scanner.close();                 //scanner object closed
        Program9 obj= new Program9();    //object creation for instance method
        obj.printFibonacciSeries(number); //called instance method
    }

    public void printFibonacciSeries(int number){    //instance method
      int a=1;                                       //initialized variable a
      int b=1;                                      //initialized variable a
      int c;                                        //declared variable c
        System.out.print(a+ " " + b);               //printed 1 and 1 of the series
        for (int i=2; i<=number;i++){               //loop started with 2 because 1 and 1 already printed
        c= a+b;                                     //logic of fibonnacci series
            System.out.print(" " + c);              //printing the result
            a=b;                                    //logic
            b=c;
        }
    }
}
