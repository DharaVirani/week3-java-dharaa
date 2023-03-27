package methodoverriding24;

public class Test2 {//Test class to create objects and call the method

    public static void main(String[] args) {
        SBI s = new SBI();   //child class object created separate because child classes exist independently
        ICICI i= new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate Of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest: " + a.getRateOfInterest());
    }
}
