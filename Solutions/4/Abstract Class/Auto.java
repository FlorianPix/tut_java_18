public class Auto extends Fahrzeug{
	@Override
	void bremsen() {
		this.setTempo(getTempo() - 10);
	}
}
