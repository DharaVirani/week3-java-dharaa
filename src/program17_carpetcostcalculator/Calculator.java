package program17_carpetcostcalculator;

/**
 * 3. Write a class with the name Calculator.
 * The class needs two fields (instance variables) with name  floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor
 * and carpet of type Carpet and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters,
 * it needs to return the calculated total  cost to cover the floor with a carpet.
 */

public class Calculator {
    Floor floor;     //instance variable with type Floor
    Carpet carpet;  //instance variable with type Carpet

    public Calculator(Floor floor, Carpet carpet){  //the class needs to have one constructor with parameters floor of type Floor
       this.floor = floor;
       this.carpet = carpet;
    }

    public double getTotalCost(){ //Method named getTotalCost without any parameters,
        return floor.getArea() * carpet.getCost(); //  it needs to return the calculated total  cost to cover the floor with a carpet.
    }
}
