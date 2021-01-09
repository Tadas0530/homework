package Homework20201214.RegularPolygon;

public class Square implements RegularPolygon {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }

}
