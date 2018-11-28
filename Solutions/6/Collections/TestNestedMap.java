import java.util.HashMap;
import java.util.Map;

public class TestNestedMap {
	public static void main ( String [] args ) {
		Map < String , Map < Integer , String >> addresses = new HashMap < String , Map < Integer , String > >() ;
		
		addresses . put (" Noethnitzer Str.", new HashMap < Integer , String >() );
		
		addresses . get (" Noethnitzer Str.").
		put (46 , " Andreas - Pfitzmann - Bau");
		addresses . get (" Noethnitzer Str.").
		put (44 , " Fraunhofer IWU ") ;
	}
}
