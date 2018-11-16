import java.util.ArrayList;
import java.util.List;

public class Garage {
	public static void main(String[] args) {
		Vehicle auto = new Car("Renault");
		Vehicle eAuto = new ElectricCar("Tesla", 123.55f);
		Vehicle bike = new Motorcycle("Honda");
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(auto);
		vehicles.add(eAuto);
		vehicles.add(bike);
		
		for(Vehicle v: vehicles) {
			System.out.println("Anzahl der Räder: " + v.getAnzahlRäder() + ", " +
								"Marke: " + v.getMarke() + ", " +
								"Steurepflichtig: " + v.isSteuernZahlen());
		}
	}
}
