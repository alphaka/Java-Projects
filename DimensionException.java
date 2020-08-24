public class DimensionException extends Exception {

	public double length;
	public double width;

	public DimensionException(double length, double width) {

		super();
		this.length = length;
		this.width = width;	

	}

	

}
