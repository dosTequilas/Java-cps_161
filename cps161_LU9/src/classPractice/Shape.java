package classPractice;

public abstract class Shape {
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double getRatio() {
		return getArea() / getPerimeter();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape[] shapes = new Shape[2];
//		shapes[0] = new Circle(2);
//		shapes[1] = new Rectangle(2, 3);
//		
//		for (Shape shape : shapes) {
//			System.out.println(shape.getRatio());
//		}
		
		Shape rectangle = new Rectangle(2, 3);
		Shape circle = new Circle(2);
		
	
		System.out.println(rectangle.getRatio());
		System.out.println(circle.getRatio());
	}

}
