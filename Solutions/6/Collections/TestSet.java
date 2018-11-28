import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main ( String [] args ) {
		Set<String> set = new HashSet <String>() ;
		set.add (" foo ") ;
		set.add (" foo2 ") ;
		set.add (" bar ") ;
		set.add (" bar ") ;
		set.remove (" foo ");
		System . out . println ( set );
	}
}