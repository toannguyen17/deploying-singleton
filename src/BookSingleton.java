
public class BookSingleton {
	private String author;
	private String title;
	private static BookSingleton instance;
	private static boolean isLoanedOut;

	private BookSingleton(){
		author = "Gamma, Helm, Johnson, and Vlissides";
		title  = "Design Patterns";
		isLoanedOut = false;
	}

	public static BookSingleton getIntance() {
		if (!isLoanedOut) {
			if (instance == null) {
				instance = new BookSingleton();
			}
			isLoanedOut = true;
			return instance;
		}
		return null;
	}

	public void returnBook(BookSingleton bookReturned){
		isLoanedOut = false;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorAndTitle(){
		return getTitle() + " by " + getAuthor();
	}
}
