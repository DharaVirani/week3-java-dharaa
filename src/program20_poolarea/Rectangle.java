package program20_poolarea;

/**
 * 1. Write a class with the name Rectangle.
 * The class needs two fields (instance variable) with name  width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it  needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getWidth without any parameters, it needs to return the value of the width field.
 * ● Method named getLength without any parameters, it needs to return the value of the length field.
 * ● Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */

public class Rectangle {
    double width;       //2instance variable
    double length;

    public Rectangle(double width, double length){   //1 constructor with params
        if(width<0){                                //condition if it is 0
         this.width=0;
        }else{
            this.width = width;                    //if condition false then initialized the variable
        }
        if(length < 0) {
            this.length = length;
        } else {
            this.length = length;
        }
    }

    public double getWidth(){        //instance method get the width value
        return this.width;
    }

    public double getLength(){          //2nd instance method to get length value
        return this.length;
    }

    public double getArea(){             //3rd instance method to get area of pool
        return getWidth() * getLength();
    }

}
