package container;

public class RectangularContainer extends Container {
    private double width;
    private double length;

    public RectangularContainer(double height, double width, double length) {
        super(height);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcTopArea() {
        return width * length;
    }

    @Override
    public double calcTopPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "RectangularContainer";
    }
}
