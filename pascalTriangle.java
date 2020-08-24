import java.util.*;

public class pascalTriangle {

	public static int factorial(int x) {
		if (x==0)
			return 1;
		return x*factorial(x-1);
	} // end factorial

	public static String pascal (int n) {

		String r="";
		int y;
		if (n==1)
			return " 1";

		for(int k=0; k<=n; k++) {
		y = factorial(n)/(factorial(n-k)*factorial(k));	
		r = r+" "+ Integer.toString(y); 
		}	
			return r;

	} //end pascal

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger");
		int n = sc.nextInt();
		System.out.println("\n" + "The pascal triangle from 1 to "+n+ " is:\n");
		for (int k =1;k<=n;k++)
		System.out.println(pascal(k)+"\n");
	
	}

} // end pascalTriangle
