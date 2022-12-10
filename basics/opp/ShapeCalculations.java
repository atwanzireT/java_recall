package opp;

/**
 * Shape
 */
abstract class Shape{
    /**
     * @return
     */
    public abstract Double area();
}

// Circle class inheriting from Shape class
class Circle extends Shape{
    Double radius = 5.0;
    @Override
    public Double area() {
        return (3.14 * (radius * radius));
    }
}

// Rectangle class inheriting from Shape class
class Rectangle extends Shape{
    Double length = 13.0;
    Double width = 3.5;

    @Override
    public Double area(){
        return length * width;
    }
}
public class ShapeCalculations {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();
        System.out.println("The area of the circle is " + circle.area());
        System.out.println("The are of the rectangle is " + rec.area());
    }
}