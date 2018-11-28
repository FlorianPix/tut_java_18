import java.util.HashMap;
import java.util.Map;

public class TestForMap {
	public static void main(String[] args) {
		Map < String , String > map = new HashMap< String , String >();
		for ( Map . Entry < String , String > entry : map . entrySet () ) {
			System . out . println (" Key : " + entry . getKey () + ", value " + entry . getValue () );
		}
	}
}
