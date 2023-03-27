package javaprogrammes;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant,
 * depending on the user input.
 * If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

public class Program3 {

    public static void main(String[] args) {            //main method
        Scanner scanner = new Scanner(System.in);       //user input
        System.out.println("Input an alphabet: ");      //asking user to input any alphabet
        String a = scanner.nextLine();                  //reading the input and stored in a variable a


        printVowelConsonant(a);                        //called static method
        scanner.close();                               //object of scanner closed

    }

    public static void printVowelConsonant(String a) {    //static method with 1 parameter
        if (a.length() > 1 || !Character.isLetter(a.charAt(0))) { //Is not a letter (between a and z or A and Z),
                                                                  // or is a string of length > 1, print an  error message.
            System.out.println("Input is not a single letter");
        } else {
            char ch = a.charAt(0);                               //false body

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { //to check vowels or  consonant
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }
}
