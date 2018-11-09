
public class Book {
	String title;
	String isbn;
	
	Book (String title, String isbn){
		this.title = title;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
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
		return this.getTitle() + " (" + this.getIsbn() + ")";
	}
}
