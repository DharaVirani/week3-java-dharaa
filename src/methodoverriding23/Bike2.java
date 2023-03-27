package methodoverriding23; //in inheritance only method overriding possible

public class Bike2 extends Vehicle{  //child class
    //defining same method as in parent class
    public void run(){ //overriding is implementation gets changed
        System.out.println("Bike is running safely");

    }
    //main method
    public static void main(String[] args) {
       Bike2 obj = new Bike2(); //creating object of child class
       obj.run(); // calling method
    }
}
