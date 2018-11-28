
public class Main {
	public static void main(String[] args) {
		Box normal = new Box("hallo");
		
		genericBox<String> stringBox = new genericBox<String>("hallo");
		
		genericBox<Integer> integerBox = new genericBox<Integer>(5);
		
		genericBox<Boolean> booleanBox = new genericBox<Boolean>(true);
	}
}
