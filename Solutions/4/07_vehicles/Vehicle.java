
public abstract class Vehicle {
	int anzahlR�der;
	String marke;
	boolean steuernZahlen = true;
	
	Vehicle(String marke){
		this.marke = marke;
	}

	public int getAnzahlR�der() {
		return anzahlR�der;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public boolean isSteuernZahlen() {
		return steuernZahlen;
	}
	public void setSteuernZahlen(boolean steuernZahlen) {
		this.steuernZahlen = steuernZahlen;
	}

	@Override
	public String toString() {
		return "Vehicle [marke=" + marke + "]";
	}
}
