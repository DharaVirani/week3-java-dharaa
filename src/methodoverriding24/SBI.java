package methodoverriding24;

public class SBI extends Bank{ //child class created of Bank parent class
    public int getRateOfInterest(){
        return 8;                  //method overriding by change of body
    }
}
