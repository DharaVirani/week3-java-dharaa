package javaprogrammes;

/**
 * 18. Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with  names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the  firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of  the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the  value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of  adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of  subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result  of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of  dividing the field values of firstNumber by the secondNumber. In case the value of  secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class Program18_SimpleCalculator {
    double firstNumber;    //2 instance variable declared
    double secondNumber;

    public double getFirstNumber(){   //1st method without any params
        return firstNumber;
    }
    public double getSecondNumber(){   //2nd method without any params
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){ //3rd method with 1 param to set the value of first number
        this.firstNumber= firstNumber;
    }
    public void setSecondNumber(double secondNumber){   //4th method with 1 param to set the value of second number
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){                //5th method to add result
        return getFirstNumber()+ getSecondNumber();   //addition of 1st and 2nd number
    }
    public double getSubtractionResult(){            //6th method
        return getFirstNumber() - getSecondNumber(); //subtraction of 1st and 2nd number
    }
    public double getMultiplicationResult() {       //7th method
        return getFirstNumber()* getSecondNumber(); //multiplication of 1st and 2nd number
    }
    public double getDivisionResult() {          //8th method
        if(getSecondNumber()==0){                  //condition
        return 0;
        }else{
            return getFirstNumber()/getSecondNumber();
        }

    }

    //Main method
    public static void main(String[] args) {
//        Main method: and called all methods according to the requirements
        Program18_SimpleCalculator calculator = new Program18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }
}
