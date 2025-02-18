abstract class shape{
    abstract void draw();
}
class Circle extends shape{
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends shape{

    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Square extends shape{
    
    void draw() {
        System.out.println("Drawing a Square");
    }
} 
class Triangle extends shape{
    
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}
class Pentagon extends shape{
    
    void draw() {
        System.out.println("Drawing a Pentagon");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        shape Circle = new Circle();
        shape Rectangle = new Rectangle();
        shape Square = new Square();
        shape Triangle = new Triangle();
        shape Pentagon = new Pentagon();
        Circle.draw();
        Rectangle.draw();
        Square.draw();
        Triangle.draw();
        Pentagon.draw();
    
    }
}


    
