public class Letter implements Trackable {
	public Position position ;
	private int identifier ;

	public int getStatus ( int identifier ) {
		return this . identifier ;
	}

	public Position getPosition ( int identifier ) {
		return this . position ;
	}
}