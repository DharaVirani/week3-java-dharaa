package javaprogrammes;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not  within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23;  otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Program13 {

    public static boolean hasSharedDigit(int a, int b){  //static method with boolean return type
      if(( a<10 ||  a> 99) || (b<10 || b>99)){          //condition
        return false;
      }
      //to check if there is any common digit in both numbers
        int digit1;
      int digit2;
      while(a>0){          //while loop
          digit1= a % 10;  //to get the remainder of the number to find last digit
          a/=10;           //to remove last digit
          int originalNumber= b;   //initialized variable originalNumber
          while(b>0){              //while loop
            digit2= originalNumber%10; //get last digit
            originalNumber/=10;    //remove last digit
            if(digit1==digit2){    //comparing two digits to check shared digit
               return true;
            }
          }
      }
      //if no matching digit found the
        return false;
    }

    public static void main(String[] args) {
//        Reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter one number between 10 and 99: ");
        int num1= scanner.nextInt();
        System.out.println("Enter second number between 10 and 99: ");
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(hasSharedDigit(num1, num2));  //printing statement by calling static method to work logic
    }
}
