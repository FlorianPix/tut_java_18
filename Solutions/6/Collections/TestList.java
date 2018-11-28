import java.util.LinkedList;
import java.util.List;

public class TestList {
	public static void main ( String [] args ) {
		List < String > list = new LinkedList < String >() ;
		
		list . add (" foo ");
		list . add (" foo "); // insert " foo " at the end
		list . add (" bar ");
		list . add (" foo ");
		list . remove ("foo "); // removes the first "foo"
		
		System . out . println ( list ); // prints : [foo , bar , foo ]
	}
}
