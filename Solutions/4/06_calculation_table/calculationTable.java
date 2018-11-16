import java.util.Scanner;

public class calculationTable {
	static int[][] table = new int[11][11];

	public static void main(String[] args) {
		int k = 0;
		// put 0 to 10 in the first row
		for(int x = 0; x <= 10; x++) {
			table[x][0] = k;
			k++;
		}
		k = 0;
		//put 0 to 10 in the first column
		for(int y = 0; y <= 10; y++) {
			table[0][y] = k;
			k++;
		}
		
		//multiply row with column
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				table[x][y] = table[x][0] * table[0][y];
			}
		}
		
		/*
		 *[[0, 	1, 	2, 	3, 	4, 	5, 	6, 	7, 	8, 	9, 	10], 
		 * [1, 	1, 	2, 	3, 	4, 	5, 	6, 	7, 	8, 	9, 	10], 
		 * [2, 	2, 	4, 	6, 	8, 	10, 12, 14, 16, 18, 20], 
		 * [3, 	3, 	6, 	9, 	12, 15, 18, 21, 24, 27, 30], 
		 * [4, 	4, 	8, 	12, 16, 20, 24, 28, 32, 36, 40], 
		 * [5, 	5, 	10, 15, 20, 25, 30, 35, 40, 45, 50], 
		 * [6, 	6, 	12, 18, 24, 30, 36, 42, 48, 54, 60], 
		 * [7, 	7, 	14, 21, 28, 35, 42, 49, 56, 63, 70], 
		 * [8, 	8, 	16, 24, 32, 40, 48, 56, 64, 72, 80], 
		 * [9, 	9, 	18, 27, 36, 45, 54, 63, 72, 81, 90], 
		 * [10, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]]
		 */
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Gib nacheinander zwei Zahlen (> 0 und <= 10) ein die du multiplizieren möchtest!");
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println(multipliziere(a,b));
			System.out.println("Weiter - 1 / Ende - 0");
			int c = input.nextInt();
			if(c == 0) {
				break;
			}
		}
		
		input.close();
		
		/*
		 * The Scanner should be closed. It is a good practice to close Readers, Streams...and this kind of objects 
		 * to free up resources and aovid memory leaks; 
		 * and doing so in a finally block to make sure that they are closed up 
		 * even if an exception occurs while handling those objects.
		 */
	}
	
	public static int multipliziere(int a, int b) {
		if(a > 0 && a <= 10 && b > 0 && b <= 10) {
			return table[a][b];
		}
		throw new IllegalArgumentException();
	}
}
