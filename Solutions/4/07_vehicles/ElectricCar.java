
public class ElectricCar extends Vehicle{
	float akkuKapazit�t;
	
	ElectricCar(String marke, float akkuKapazit�t){
		super(marke);
		
		this.akkuKapazit�t = akkuKapazit�t;
		this.anzahlR�der = 4;
		this.steuernZahlen = false;
	}
	
	public float getAkkuKapazit�t() {
		return akkuKapazit�t;
	}
	public void setAkkuKapazit�t(float akkuKapazit�t) {
		this.akkuKapazit�t = akkuKapazit�t;
	}
	public boolean isSteuernZahlen() {
		return steuernZahlen;
	}
	public void setSteuernZahlen(boolean steuernZahlen) {
		this.steuernZahlen = steuernZahlen;
	}

	@Override
	public String toString() {
		return "ElectricCar [marke= " + getMarke() + " ,akkuKapazit�t= " + akkuKapazit�t + "]";
	}
}
