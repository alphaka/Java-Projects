import java.util.*;

public class Fraction implements Comparable<Fraction> {


	private int numer;
	private int denom;
	// adding two fractions, the first one is this, and the second add

	public Fraction(int numer, int denom) {

		this.numer = numer;
		this.denom = denom;

		simplify();

	}

	public Fraction (int numer) {

		this(numer, 1);

		/*
		this.numer = numer;
		this.denom = 1;

		*/
	}

	public Fraction add(Fraction another) {

		int newDenom = this.denom * another.denom;
		int newNumer = this.numer * another.denom +
				this.denom * another.numer;

		Fraction answer = new Fraction(newNumer, newDenom);

		return answer;
	}

	public Fraction multiply(Fraction another) {

		int newDenom = this.denom * another.denom;
		int newNumer = this.numer * another.numer;

		Fraction answer = new Fraction(newNumer, newDenom);

		return answer;

	}

	public boolean equals(Object obj) {

		boolean result = obj instanceof Fraction;

		if(!result)
			return false;

		/*
		if(! (obj instanceof Fraction))
			return false;
		*/

		Fraction another = (Fraction) obj;

		return this.compareTo(another)== 0;

		/*
		 a second way of the above lign is below

		return this.numer==another.numer
			&& this.denom==another.denom;

		*/
	} // end boolean

	public int compareTo(Fraction another) {

		int numerThis =  this.numer * another.denom;
		int numerAnother = this.denom * another.numer;

		return numerThis - numerAnother;

	} // end compareTo

	private void simplify() {

		int divisor = gcd(numer, denom);

		numer = numer / divisor;
		denom = denom / divisor;

	} // end Simplify

	// Euclieu algorithm for finding the greatest common multiple between two numbers.

	public static int gcd(int a, int b) {

		if(b==0)
			return a;
		else
			return gcd(b, a%b);
	} // end gcd

	// Fraction substraction method

	private Fraction negate() {

		return new Fraction(-numer, denom);

	}

	public Fraction substraction(Fraction another) {

		return add(another.negate());
	}

/**
// end Fraction substraction

	private Fraction reciprocal() {

		return new Fractin(denom, numer);

	}

	private Fraction divide(another Fraction) {

		return multiply(another.reciprocal());

	}
*/

	public String toString() {

		return numer + (denom!=1? "/" + denom: "") ;

	} // end toString

	public static void main(String[] args) {

		Fraction[] numbers = { new Fraction(1,2),
					new Fraction(2,3),
					new Fraction (1),
					new Fraction(5,7),
					new Fraction(1,8),
					new Fraction(6,9),
					new Fraction(9,10)};

		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));

	/*
	Will talk more about the below code in the semester

	Comparable<Fraction> comp;

	comp = new Fraction(3);
	*/

	} // end main


} // end fraction
