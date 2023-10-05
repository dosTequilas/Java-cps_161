package container;

public abstract class Container {

    protected double height;

    public Container(double height) {
        this.height = height;
    }

    public abstract double calcTopArea();

    public abstract double calcTopPerimeter();

//    MORE PRECISE VERSION:
    
//    public double calcVolume() {
//        return height * calcTopArea();
//    }
//
//    public double calcSurfaceArea() {
//        return 2 * calcTopArea() + height * calcTopPerimeter();
//    }
    
    
//    2 DECIMAL PLACES  VERSION:
    
    public double calcVolume() {
        double volume = height * calcTopArea();
        return Double.parseDouble(String.format("%.2f", volume));
    }

    public double calcSurfaceArea() {
    	double area = 2 * calcTopArea() + height * calcTopPerimeter();
    	return Double.parseDouble(String.format("%.2f", area));
    }
    
    @Override
    public String toString() {
        return "Container";
    }

}
