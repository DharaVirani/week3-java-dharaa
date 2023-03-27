package constructoroverloading25;
//java program to overload constructors

public class Student5 {
    int id;
    String name;
    int age;
    //creating two args constructor
    Student5(int i, String n){
      id = i;
      name = n;
    }
    //creating 3 args constructor
    Student5(int i, String n, int a){
      id = i;
      name = n;
      age =a;
    }
    //instance method
    public void display(){
        System.out.println(id+ " " + name + " " + age);
    }
    //main method
    public static void main(String[] args) {
        Student5 s1= new Student5(111,"Karan"); //instance variable value assigned while creating object of constructor
        Student5 s2= new Student5(222,"Aryan",25); //instance variable value assigned while creating object of constructor
        s1.display();                                     //called method with s1 object of constructor
        s2.display();
    }
}
