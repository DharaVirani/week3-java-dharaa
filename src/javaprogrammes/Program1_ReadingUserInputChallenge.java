package javaprogrammes;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class Program1_ReadingUserInputChallenge {
    public static void main(String[] args) {

//        using scanner to read input from console

        Scanner scanner= new Scanner(System.in);
        int counter = 1;            //counter variable declared and will be used to check the valid numbers
        int sum = 0;                //declared sum variable  and initialized it to 0

        while(counter <= 10){       //while loop to read 10 valid numbers and used counter variable in it
            System.out.println("Enter number #" + counter + ":");

            if(scanner.hasNextInt()){   //used hasNextInt() method to check if user has entered integer numbers
            int num= scanner.nextInt(); //storing the input in num and read the user input
            sum+=num;                  //and added that num to sum
            counter++;                 //increment to read all the numbers printed in console until 10
            }else{
                System.out.println("Invalid number");  //if not valid numbers print this
            }

            scanner.nextLine();        //to get the other inputs in console and continue the iteration until 10

        }
        System.out.println("Sum of all the numbers is: " + sum); //then printing sum

        scanner.close();


    }


}
