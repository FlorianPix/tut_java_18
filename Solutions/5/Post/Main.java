
public class Main {
	public static void main ( String [] args ) {
		Trackable postcard_T = new Postcard () ;
		Postcard postcard_P = new Postcard () ;
		Buyable postcard_B = new Postcard () ;
		
		//postcard T can access Trackable.
		postcard_T . getStatus (1234) ;
		//postcard B can access Buyable.
		postcard_B . getPrice () ;
		//postcard P can access both interfaces.
		postcard_P . getStatus (1234) ;
		postcard_P . getPrice () ;
	}
}
