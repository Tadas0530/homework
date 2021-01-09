package Homework20201214.RegularPolygon;

public interface RegularPolygon {
    double getNumSides();
    double getSideLength();

    default double getPerimeter(double n, double length) {
        return n * length;
    }

    default double getInteriorAngle(double n) {
        return (n - 2) * 180;
    }
}
