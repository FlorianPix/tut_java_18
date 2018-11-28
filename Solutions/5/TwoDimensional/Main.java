
public class Main {
	public static void main(String[] args) {
		Square s = new Square(5);
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(2,3);
		System.out.println(s.getPerimeter() + " " + s.getArea());
		System.out.println(c.getPerimeter() + " " + c.getArea());
		System.out.println(r.getPerimeter() + " " + r.getArea());
	}
}
