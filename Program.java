public class Program {

	public static void main(Sring[] args) {

		Shape[] shapes = new Shape[5];

		// creates 5 reference variable that each references an object of type Shape

		try {

			shapes[0] = new Circle(1);
	
			shapes[1] = new Rectangle(4,2);
 	
			shapes[2] = new Rectangle(10,3);

			shapes[3] = new Square(2);

			shapes[4] = new Circle(4);

		} catch (DimensionException e) {

		System.err.println("dimension error!" );

		} catch (IllegalArgumentException e) {
			
			System.err.println("Illegal argument passed.");
		} catch (Exception e) {

			System.err.println(e.getMessage());

		}

		System.out.println("There have been " + Circle.getNumCircles()
					+ " cercle created so far.");

		// The way we call a static method of a class is like: "Name of the class".method'sName;

		printAreas(shapes);

		public static void printAreas(Shape[] shapes) {

			for(int i =0; i<shapes.length; i++)
				System.out.println(shapes[i].area());

		} // end printAreas

	} // end main

} // end Program
