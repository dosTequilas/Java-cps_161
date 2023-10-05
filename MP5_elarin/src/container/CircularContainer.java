package container;

public class CircularContainer extends Container {
    private double radius;

    public CircularContainer(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double calcTopArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcTopPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircularContainer";
    }
}

