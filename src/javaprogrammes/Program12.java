package javaprogrammes;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words,  prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)
 */

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in); //reading input from the console window
        System.out.println("Input a number: ");
        int number= scanner.nextInt();
        scanner.close();
        primeNumbers(number);              //called static method
    }
    public static void primeNumbers(int number){
      if(number>1){                         //prime numbers are greater than 1
        for(int i =2; i<number; i++){      //if they are greater than 1 we iterate through the number from 2
          if(number % i==0){               //checking if the number is divisible by i which is in the loop
              System.out.println(number + "is not a prime number"); //then it is not a prime number
              return;
          }
        } //if loop completes without finding divisor then the number is prime
          System.out.println(number + " is a prime number");
      }else{
          System.out.println(number + " is not a prime number"); //if the number is less than or quals one then it is not prime
      }
    }
}
