public class Postcard implements Buyable , Trackable {
	public Position position ;
	private int identifier ;
	private float priceWithoutVAT ;

	public float getPrice () {
		return priceWithoutVAT * tax ;
	}

	public int getStatus ( int identifier ) {
		return this . identifier ;
	}

	public Position getPosition (int identifier ) {
		return this . position ;
	}
}