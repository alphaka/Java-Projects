import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		/*
		 an Array has a fixed side, on the other hand, an ArrayList keeps growing more
		 more and more. An arraylist can't store primitive variable it only stores object.
		 But Java has wrapper class to convert from primitive type to reference type.

		Wrapper classes like:
		int -> Integer
		double -> Double
		char -> Character
		 
		*/

		// Initialization of an arraylist below

		ArrayList<Integer> list = new Arraylist<Integer>();

		for(int i =0; i<10; i++)
			list.add(i+1);

	}// end main


	public static void print(ArrayList<Integer> list) {

		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));

	}

	public static void addOne(ArrayList<Integer> list) {

		for(int i=0; i<list.size(); i++)
			list.set(i, list.get(i) +1);
	}

} // end ArrayLisy
