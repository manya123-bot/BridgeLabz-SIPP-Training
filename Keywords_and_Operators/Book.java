public class Book {
    private static String libraryName = "City Library";
    private static int totalBooks = 0;

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        displayLibraryName();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        System.out.println("Total Books: " + totalBooks);
        Book book2 = new Book("1984", "George Orwell", "ISBN002");
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
        System.out.println("Total Books: " + totalBooks);
    }
}