public class Rectangle implements Shape{

	private double length;

	private double width;

	public Rectangle(double length, double width) throws DimensionException,
					      IllegalArgumentException{
		if(length<width)
			throw new DimensionException(length, width);

		if(length<=0 || width<=0)
			throw new IllegalArgumentException();
			

		this.length = length;
		this.width = width;

	}

	@Override
	public double perimeter() {

		return 2*(length + width);
	}

	@Override
	public double area() {

		return length*width;

	}

} // end Rectangle
