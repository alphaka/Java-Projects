import java.util.*;

public class TestExceptions {

	public static double divide(int x, int y) throws Exception {

		if (y==0)
			throw new Exception("Cant perform " + x+"/0");

		return (double) x/y;

	} // end divide

	public static void main(String[] args) {

		/*
		try {

		System.out.println(divide(3,0));

		}catch(Exception error) {

			System.err.println("Sorry.");
		}
		*/

		Scanner input = new Scanner(System.in);

		while(true) {

			System.out.print("Enter a number: ");

			int first = input.nextInt();

			if (first == -1)
				break;

			System.out.print("Enter another	number: ");

			int second = input.nextInt();

			if (first ==0 || second ==0)
				break;

			try {

				double result = divide(first,second);

				System.out.println(first + " /" + second + " = " + result);

				}catch(Exception e) {

					System.err.println(e.getMessage());

				} // end catch

		} // end while

	}// end main

}
