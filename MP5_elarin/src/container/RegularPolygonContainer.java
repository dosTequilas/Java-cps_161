package container;

public class RegularPolygonContainer extends Container {
    private double side;
    private int numSides;

    public RegularPolygonContainer(double height, double side, int numSides) {
        super(height);
        this.side = side;
        this.numSides = numSides;
    }

    @Override
    public double calcTopArea() {
        return (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));
    }

    @Override
    public double calcTopPerimeter() {
        return numSides * side;
    }

    @Override
    public String toString() {
        return "RegularPolygonContainer";
    }
}
