public class ArgsNumbersProcessing {

	public static void main(String[] args) {

		if(args.length!=3) {
		System.out.println("Must enter three variables");
		System.exit(1);
		}

		int operand1 =  Integer.parseInt(args[0]);

		char operator = args[1].charAt(1);
		
		int operand2 = Integer.parseInt(args[2]);

		int ans = process(operand1,operator,operand2);

		System.out.println(ans);
	
	} // end main

	private static int process(int op1, char operator, int op2){ 

		int ans = 0;

		switch(operator) {
			case '+':
				ans = op1 + op2;
				break;
			case '-':
				ans = op1 - op2;
				break;
			case '*':
				ans = op1 * op2;
				break;
			case'/':
				ans = op1 / op2;
				break;

		}
		return ans;
	
	} // end process

}// end class
