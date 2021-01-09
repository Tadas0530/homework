package Homework20201214.RegularPolygon;

public class RegularPolygonMain {
    public static void main(String[] args) {
        RegularPolygon triangle = new EquilateralTriangle(10);
        System.out.println(triangle.getPerimeter(triangle.getNumSides(), triangle.getSideLength()));
        System.out.println(triangle.getInteriorAngle(triangle.getNumSides()));

        RegularPolygon square = new Square(10);
        System.out.println(square.getPerimeter(square.getNumSides(), square.getSideLength()));
        System.out.println(square.getInteriorAngle(square.getNumSides()));

    }
}
