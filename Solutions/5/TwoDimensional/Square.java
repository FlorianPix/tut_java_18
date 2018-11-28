
public class Square implements TwoDimensional{
	int a;
	
	Square(int a){
		this.a = a;
	}
	
	public double getPerimeter() {
		return 4*a;
	}

	public double getArea() {
		return a^2;
	}

}
