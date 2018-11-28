public class Calc {
	public static void main ( String [] args ) {
		try {
			int a = 7 / 0;
		} catch ( ArithmeticException e) {
			System . out . println (" Division by zero .");
			e.printStackTrace();
		}
	}
}