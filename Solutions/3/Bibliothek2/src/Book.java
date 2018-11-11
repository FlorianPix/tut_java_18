
public class Book {
	String title, isbn, author;
	
	Book (String title, String author, String isbn){
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return this.getAuthor() + " " + this.getTitle() + " (" + this.getIsbn() + ")";
	}
}
