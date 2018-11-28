import java.util.*;

public class TestIterator {
	public static void main ( String [] args ) {
		List < Integer > list = new LinkedList < Integer >() ;
		
		list . add (1) ;
		list . add (3) ;
		list . add (3) ;
		list . add (7) ;

		Iterator<Integer> iter = list . iterator () ;

		while ( iter . hasNext () ) {
			System . out . print ( iter . next () ); // prints : 1337
		}
	}
}
