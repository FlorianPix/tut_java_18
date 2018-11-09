import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Gib eine Temperatur in Celsius an die du in Fahrenheit umwandeln möchtest!");
		int celsius = input.nextInt();
		int fahrenheit = celsius * 9 / 5 + 32;
		System.out.println(celsius + "°C sind " + fahrenheit + "°F");
	}
}