package javaprogrammes;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */

public class Program2_MinAndMaxInputChallenge {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);   //reading input from user
        int min = 0;                                //initialized min number
        int max = 0;                                //initialized max number
        boolean isFirstNumber = true;               //initialized first number to keep track if the first number entered
        //while loop
        while (true) {                              //while loop
            System.out.println("Enter number: ");
            boolean isNumber = scanner.hasNextInt(); //has next method used to check integer value
            if (isNumber) {                           //if isNumber variable is an integer
                int number = scanner.nextInt();       //then reading and taking input
                if (isFirstNumber) {                  //condition it is the first number the set  min and max value as number
                    min = number;
                    max = number;
                    isFirstNumber = false;           //and set to false
                }
                if (number > max) {                  //number is greater than max then it's maximum value
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {                               //to get out of the loop if fulfills the condition
                break;
            }
            scanner.nextLine();     //for the other user input from console
        }
        System.out.println("Minimum number is:  " + min );
        System.out.println("Maximum number is:  " + max );
        scanner.close();
    }



    }





