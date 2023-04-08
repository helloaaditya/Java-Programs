//PROGRAM 5: Demonstrate a program to execute interfaces and abstract classes.
abstract class Bike
{
Bike()
{
System.out.println("bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("gear changed");
}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike
{
void run()
{
System.out.println("running safely..");
}
}

//interface declaration
interface Polygon_Shape {
    void calculateArea(int length, int breadth);
    }
    //implement the interface
    class Rectangle implements Polygon_Shape {
    //implement the interface method
    public void calculateArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " +
    (length * breadth));
    }
    }
    class program5 {
    public static void main(String[] args) {
        System.out.println("Demonstrate abstract classes.");
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
        Rectangle rect = new Rectangle(); 
        System.out.println("Demonstrate interfaces.");
        rect.calculateArea(10, 20); 
    }
    }