import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Temperature t = new Temperature();
		Scanner input = new Scanner(System.in);
		int celsius;
		int condition;
		
		while(true){
			System.out.println("Gib einen Temperatur in Celsius ein die du in Fahrenheit umwandeln möchtest!");
			celsius = input.nextInt();
			System.out.println(t.convert(celsius));
			System.out.println("Beenden? 1-ja/0-nein");
			condition = input.nextInt();
			if(condition==1) {
				break;
			}
		}
	}
}
