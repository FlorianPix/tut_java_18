import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main ( String [] args ) {
		Map < Integer , String > map = new HashMap < Integer , String >() ;

		map . put (23 , " foo ") ;
		map . put (28 , " foo ") ;
		map . put (31 , " bar ") ;
		map . put (23 , " bar ") ; // " bar " replaces " foo " for key = 23
		
		System . out . println ( map );
		// prints : {23= bar , 28= foo , 31= bar }
	}
}
