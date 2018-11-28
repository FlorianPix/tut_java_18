public class Finally {
	public static void main ( String [] args ) {
		try {
			int a = 7 / 0;
		} catch ( ArithmeticException e) {
			System . out . println (" Division by zero .");
			e. printStackTrace () ;
		} finally {
			System . out . println (" End of program .");
		}
	}
}