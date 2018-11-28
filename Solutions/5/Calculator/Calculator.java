import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b, end;
		while(true) {
			System.out.println("1.Zahl eingeben!");
			a = input.nextInt();
			System.out.println("+ , - , *, /");
			String op = input.next();
			System.out.println("2.Zahl eingeben!");
			b = input.nextInt();
			if(op.equals("/") && b == 0) {
				System.out.println("Division durch 0 ist nicht möglich.");
				continue;
			}
			
			switch(op) {
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);
					break;
			}
			
			System.out.println("Weiter - 1, Beenden - 0");
			end = input.nextInt();
			if(end == 0) {
				break;
			}
		}
	}
}
