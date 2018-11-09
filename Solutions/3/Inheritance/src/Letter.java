public class Letter extends Delivery1 {
	
	public Letter ( String address , String sender ) {
		super ( address , sender ) ;
	}
	
	@Override // not needed annotation
	public void printAddress () {
		System . out . println ("a letter for " + this.getAddress());
	}
	
	public static void main(String[] args) {
		Letter letter = new Letter("asdf", "asdf");
		letter.
	}
}
