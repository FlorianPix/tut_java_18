
public class Rectangle implements TwoDimensional {
	int a,b;
	
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public double getPerimeter() {
		return 2*a + 2*b;
	}

	public double getArea() {
		return a*b;
	}
}
