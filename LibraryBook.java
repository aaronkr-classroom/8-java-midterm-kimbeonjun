public class LibraryBook implements Book {
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;

	public LibraryBook(Book book) {
	    // 생성자
		this.isbn = book.getIsbn();
		this.available = true;
	}

	public LibraryBook(String isbn, String title, String author, int year) {
	    // 생성자
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.year = year;
	}

	@Override
	public String getIsbn() {
		return isbn;// return isbn
	}
	public String getTitle() {
		return title;// return title
	}
	public String getAuthor() {
		return author;// return author
	}
	public int getYear() {
		return year;// return year
	}
	public boolean isAvailable() {
		return available;// return available
	}
	public void setAvailable(boolean available) {
		return;
	}
}
