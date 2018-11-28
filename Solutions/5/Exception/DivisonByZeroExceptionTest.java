public class DivisonByZeroExceptionTest {
	public static int divide ( int divident , int divisor ) throws DivisionByZeroException {
		if ( divisor == 0) {
			throw new DivisionByZeroException () ;
		}
		return divident / divisor ;
	}
	
	public static void main ( String [] args ) {
		int a = 0;
		try {
			a = DivisonByZeroExceptionTest . divide (7 , 0) ;
		} catch ( DivisionByZeroException e) {
			System . out . println (" Division by zero .");
			e. printStackTrace () ;
		}
	}
}
