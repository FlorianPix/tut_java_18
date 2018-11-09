public class Student {
	String name, geburtsdatum, haarfarbe;
	
	Student(String name, String geburtsdatum, String haarfarbe){
		this.name = name;
		this.geburtsdatum = geburtsdatum;
		this.haarfarbe = haarfarbe;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}
	
	public String toString() {
		return name + " " + geburtsdatum + " " + haarfarbe;
	}
}
