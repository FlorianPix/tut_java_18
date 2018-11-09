
public class Delivery1 {
	private String address, sender;
	
	Delivery1(String addr, String snd){
		this.address = addr;
		this.sender = snd;
	}
		
	public void setAddress ( String addr ) {
		address = addr ;
	}
	
	public String getAddress () {
		return address;
	}
		
	public void setSender ( String snd ) {
		sender = snd ;
	}

	public void printAddress () {
		System . out . println ( this . address );
	}
}

