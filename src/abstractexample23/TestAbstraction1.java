package abstractexample23;

/**
 * 4. Create the fourth class name TestAbstraction1 and inside create the  main method as below.
 */

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle1(); //object is provided by normal method and we can refer abstract class while creating object
        s.draw();                //called method
    }
}
