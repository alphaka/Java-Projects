public class Circle implements Shape {

	private double radius;
	
	public static final double PI = 3.14159;

	// static: means it belongs to the class as a whole 
	// final: can't change

	private static int numCirclesCreated = 0;

	public Circle(double radius) {
	
		if(radius <=0)
			throw new IllegalArgumentException();

		numCirclesCreated++;
		this.radius = radius;

	}

	public static int getNumCircles() {

		return numCirclesCreated;

	}

	@Override
	public double perimeter() {

		return circumference();

	}

	public double circumference() {
		return 2* PI * radius;
	}

	public double area() {

		return PI*Math.pow(radius, 2);

	} // end area


}// end Circle
