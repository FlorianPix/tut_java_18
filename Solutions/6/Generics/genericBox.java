
public class genericBox<T> {
	private T t;
	
	genericBox(T t){
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
