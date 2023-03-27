package javaprogrammes;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them;
 * also we don't want to process  negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method
 * to determine that it is working  correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 *  Use n = n / 10 to discard the least-significant digit.
 *  The method needs to be static
 *  Create a class with the name DigitSumChallenge.
 */

public class Program4DigitSumChallenge {

    public static void main(String[] args) {       //main method
        Scanner scanner= new Scanner(System.in );  //reading input from console
        System.out.println("Enter a number: ");    //Asking user for input
        int number= scanner.nextInt();              //taking the input from console and stored in the variable number
        System.out.println(sumDigits(number));     //printing and called static method
        scanner.close();                           //scanner object closed

    }

    public static int sumDigits(int number) {      //static method with 1 parameter
        int sum = 0;                               //initialized sum variable
        if (number < 10) {                         //If the parameter is >= 10 then the method should process the number and return sum of all digits,
                                                   // otherwise return -1 to indicate an invalid value.
            return -1;
        }
        while (number>0) {                          //if number greater than 0
        int digit = number % 10;                    //to find last digit
        sum+=digit;                                 //that digit added to the sum
        number /=10;                                //to remove last digit
        }
        return sum;                                 //then return sum of it

    }
}
