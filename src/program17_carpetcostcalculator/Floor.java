package program17_carpetcostcalculator;

/**
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it  needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area  (width * length).
 */

public class Floor {
    double width;    //2instance variables
    double length;

    public Floor(double width, double length){  //constructor with width and length params
      if(width<0){                              //condition
        this.width=0;
      }else{
          this.width = width;
      }
      if(width<0){
       this.length = 0;
      }else {
          this.length = length;
      }
    }
    public double getArea(){ //Method named getArea without any parameters
        return  this.width * this.length; //it needs to return the calculated area  (width * length).
    }



}
