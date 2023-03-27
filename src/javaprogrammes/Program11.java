package javaprogrammes;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program11 {
public static int getEvenDigitSum(int number) {
    if (number < 0) {               //If the number is negative, the method should return -1 to indicate an invalid value
        return -1;

    }
    int sum = 0;                     //initialized the sum variable
    while (number > 0) {            //while loop with condition if the number is greater than 0
        int lastDigit = number % 10; //find last digit
        if (lastDigit % 2 == 0) {  //if condition for even numbers
            sum += lastDigit;     //for each even digit found the digit is added to the sum
        }
        number /= 10;               //remove last digit
    }
    return sum;                     //return the sum
}

    public static void main(String[] args) {        //main method
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int number= scanner.nextInt();
        scanner.close();
        System.out.println(getEvenDigitSum(number));  //print statement by calling static method
    }
}
