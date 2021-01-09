package Homework20201214.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 5.5d);
        RightAngleRectangle angle = new RightAngleRectangle("Right angle rectangle", 7.2d, 9.6d);
        Rectangle rectangle = new Rectangle("rectangle",17,11);

        double circleArea = Math.PI * (circle.getRadius() * circle.getRadius());
        double circleLength = 2 * Math.PI * circle.getRadius();

        double rightAngleTriangleArea = (angle.getWidth() * angle.getHeight()) / 2;
        double rightAngleRectangleArea = (angle.getHeight() * angle.getWidth());

        System.out.println(circleArea);
        System.out.println(circleLength);
        System.out.println(rightAngleRectangleArea);
        System.out.println(rightAngleTriangleArea);
    }
}
