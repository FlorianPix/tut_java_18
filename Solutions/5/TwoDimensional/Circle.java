
public class Circle implements TwoDimensional{
	int r;
	
	Circle(int r){
		this.r = r;
	}
	
	public double getPerimeter() {
		return 2*pi*r;
	}

	public double getArea() {
		return 2*pi*(r^2);
	}
}
