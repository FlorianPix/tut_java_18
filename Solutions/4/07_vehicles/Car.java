
public class Car extends Vehicle{
	boolean autopilot;
	
	public Car(String marke) {
		super(marke);
		this.anzahlR�der = 4;
	}

	public boolean isAutopilot() {
		return autopilot;
	}

	public void setAutopilot(boolean autopilot) {
		this.autopilot = autopilot;
	}

	
}
