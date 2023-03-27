package javaprogrammes;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point.
 * The class needs two  fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters x and y of type int and it needs to initialize the  fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this  Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance  between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance  between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */

public class Program16_Point {

    int x;    //two instance variables
    int y;

    Program16_Point(){   //1st constructor
    }

    Program16_Point(int x, int y){  //2nd constructor with params
        this.x = x;                 //initialized the fields
        this.y = y;
    }

    public int getX(){            //1st method and return x
        return x;                   //return value of x
    }

    public int getY(){          //2nd method and return y
        return y;                //returns value of y
    }

    public void setX(int x){       //3rd method and set x
        this.x= x;                  //set the value of x
    }

    public void setY(int y){        //4th method and set y
        this.y =y;                  //set the value of y
    }

    public double distance(){        //5th method without params
        return Math.sqrt(x * x + y * y);  //it needs to return the distance between this  Point and Point 0,0 as double.
    }

    public double distance(int x, int y){    //6th method with params
      int xDiff = this.x - x;
      int yDiff = this.y - y;
      return Math.sqrt(xDiff * xDiff + yDiff * yDiff); //it needs to return the distance  between this Point and Point x,y as double
    }

    public double distance(Program16_Point another){           //7th method with 1 param
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff); //it needs to return the distance  between this Point and another Point  as double
    }

    public static void main(String[] args) {
//        Write the below code into the main method.
        Program16_Point first = new Program16_Point(6,5); //constructor 2nd object creation to assign value to instance variable
        Program16_Point second = new Program16_Point(3,1); //called 2nd constructor
        System.out.println("distance(0,0)=" + first.distance()); //print statement and called 5th  method for 1st object
        System.out.println("distance(second)=" + first.distance(second)); //called 1st object with 7th method
        System.out.println("distance(2,2)=" + first.distance(2,2)); //called 6th method for 1st object
        Program16_Point point= new Program16_Point();                   //object creation
        System.out.println("distance()= " + point.distance());   //called 5th method
    }



}
