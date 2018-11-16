public abstract class Fahrzeug {
	private int tempo = 0;
	
	public void beschleunigen() {
		this.setTempo(getTempo() + 10);
	}
	
	abstract void bremsen();

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
