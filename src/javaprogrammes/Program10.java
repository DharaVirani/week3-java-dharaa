package javaprogrammes;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Program10 {
    public static void main(String[] args) {
//        Reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number :");
        int number= scanner.nextInt();
        scanner.close();                    //scanner object closed
        armstrongNumber(number);           //called static method

    }
    public static void armstrongNumber(int number){
      int originalNumber= number;      //variable originalNumber declared because we are going to not change the original value
        int digit =0;
        int lastDigit=0;
        int sum=0;


     while(originalNumber!=0){                       //if the number is more than 0 condition
        lastDigit=originalNumber%10;                //find last digit
         sum+= Math.pow(lastDigit, 3); //calculate the power of the number of times the number is multiplied i.e 1*1*1
         originalNumber/=10;                      //last digit is removed from originalNumber after division by 10

      }
     //comparing the sum with number
        if(sum==number){
            System.out.println(number + " is an Armstrong number");      //true body
        }else{
            System.out.println(number + " is not an Armstrong number");  //false body
        }

    }
}
