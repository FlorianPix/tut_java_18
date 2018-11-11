import java.util.Scanner;
public class Library {
	Book[][] Bibo = new Book[10][100];
	
	public Book ausleihen(String title) {
		Book geliehen = null;
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 100; i++) {
				if(Bibo[j][i] != null) {
					if(title.equals(Bibo[j][i].getTitle())) {
						geliehen = Bibo[j][i];
						Bibo[j][i] = null;
					}
				}
			}
		}
		return geliehen;
	}
	
	public boolean geben(String title, String author, String isbn) {
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 100; i++) {
				if(Bibo != null) {
					if(Bibo[j][i] == null) {
						Book book = new Book(title, author, isbn);
						Bibo[j][i] = book;
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void listBook() {
		System.out.println("Wir haben ");
		int j = 0;
		for(int k = 0; k < 10; k++) {
			for(int i = 0; i<100; i++) {
				if(Bibo[k][i] != null) {
					System.out.println(Bibo[k][i]);
					j++;
				}
			}
		}
		if(j == 0) {
			System.out.println("aktuell keine Bücher in der Bibliothek.");
		}else {
			System.out.println("in der Bibliothek.");
		}
	} 
	
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			boolean abbruch = false;
			System.out.println("Was möchtest du tun? Ausleihen 1, Geben 2, Anzeigen 3, Abbrechen 4");
			int choice = input.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Welchen Titel hat das Buch das du ausleihen möchtest?");
					String title = input.next();
					Book book = lib.ausleihen(title);
					if(book != null) {
						System.out.println("Du hast " + book  + " ausgeliehen.");
					}else {
						System.out.println("Dieses Buch haben wir leider nicht.");
					}
					break;
				case 2:
					System.out.println("Was für ein Buch möchtest du uns geben?");
					System.out.println("Bitte Titel eingeben.");
					String title2 = input.next();
					System.out.println("Bitte Autor eingeben.");
					String author2 = input.next();
					System.out.println("Bitte ISBN eingeben.");
					String isbn = input.next();
					if(lib.geben(title2, author2, isbn)) {
						System.out.println("Danke für die Spende von " + title2);
					}else {
						System.out.println("Die Bibliothek ist leider voll.");
					}
					break;
				case 3:
					lib.listBook();
					break;
				case 4:	
					abbruch = true;
					break;
				default:
					System.out.println("Falsche Eingabe!");
					System.out.println("Was möchtest du tun? Ausleihen 1, Geben 2, Anzeigen 3");
			}
			if(abbruch) {
				break;
			}
		}
	}
}