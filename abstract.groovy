abstract class shape{
    abstract void draw();
}
class Circle extends shape{
    @override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extens shape{
    @override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Square extens shape{
    @override
    void draw() {
        System.out.println("Drawing a Square");
    }
} 
class Triangle extens shape{
    @override
    void draw() {
        System.out.println("Drawing a Traiangle")
    }
}
class Pentagon extens shape{
    @override
    void draw() {
        System.out.println("Drawing a Pentagon")
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Shape Circle = new circle();
        Shape Rectangle = new Rectangle();
        Shape Square = new Square();
        Shape Traiangle = new Traiangle();
        Shape Pentagon = new Pentagon();
        Circle.draw;
        Rectangle.draw;
        Square.draw;
        Traingle.draw;
        Pentagon.draw;
    
    }
}


    
