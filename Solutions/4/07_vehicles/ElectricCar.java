
public class ElectricCar extends Vehicle{
	float akkuKapazität;
	
	ElectricCar(String marke, float akkuKapazität){
		super(marke);
		
		this.akkuKapazität = akkuKapazität;
		this.anzahlRäder = 4;
		this.steuernZahlen = false;
	}
	
	public float getAkkuKapazität() {
		return akkuKapazität;
	}
	public void setAkkuKapazität(float akkuKapazität) {
		this.akkuKapazität = akkuKapazität;
	}
	public boolean isSteuernZahlen() {
		return steuernZahlen;
	}
	public void setSteuernZahlen(boolean steuernZahlen) {
		this.steuernZahlen = steuernZahlen;
	}

	@Override
	public String toString() {
		return "ElectricCar [marke= " + getMarke() + " ,akkuKapazität= " + akkuKapazität + "]";
	}
}
