package Homework20201214.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
