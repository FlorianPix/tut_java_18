public class PropagateExceptions1 {
	public static int divide ( int divident , int divisor ) throws ArithmeticException {
		return divident / divisor ;
	}
	
	public static void main ( String [] args ) {
		int a = 0;
		try {
			a = PropagateExceptions1.divide (7 , 0) ;
		} catch ( ArithmeticException e) {
			System . out . println (" Division by zero .");
			e. printStackTrace () ;
		}
	}
}