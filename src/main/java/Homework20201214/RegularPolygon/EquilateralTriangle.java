package Homework20201214.RegularPolygon;

public class EquilateralTriangle implements RegularPolygon{

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;

    }

    @Override
    public double getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}

