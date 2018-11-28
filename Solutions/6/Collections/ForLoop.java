import java.util.LinkedList;
import java.util.List;

public class ForLoop {
	public static void main ( String [] args ) {
		List < Integer > list = new LinkedList < Integer >() ;
		
		list . add (1) ;
		list . add (3) ;
		list . add (3) ;
		list . add (7) ;

		for (Integer i : list ) {
			System . out . print ( i + " "); // prints : 1 3 3 7
		}
	}
}
