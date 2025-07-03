abstract class LibraryItem {
    private String id, title, author;

    public LibraryItem(String i, String t, String a) {
        id = i;
        title = t;
        author = a;
    }

    public String getDetails() {
        return id + ": " + title;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserve();

    boolean check();

    void setBorrower(String n);

    String getBorrower();
}

class Book extends LibraryItem implements Reservable {
    private String borrower;

    public Book(String i, String t, String a) {
        super(i, t, a);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserve() {
    }

    public boolean check() {
        return true;
    }

    public void setBorrower(String n) {
        borrower = n;
    }

    public String getBorrower() {
        return borrower;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String borrower;

    public Magazine(String i, String t, String a) {
        super(i, t, a);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserve() {
    }

    public boolean check() {
        return true;
    }

    public void setBorrower(String n) {
        borrower = n;
    }

    public String getBorrower() {
        return borrower;
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrower;

    public DVD(String i, String t, String a) {
        super(i, t, a);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserve() {
    }

    public boolean check() {
        return true;
    }

    public void setBorrower(String n) {
        borrower = n;
    }

    public String getBorrower() {
        return borrower;
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("1", "Java", "A"),
                new Magazine("2", "Mag", "B"),
                new DVD("3", "Movie", "C")
        };
        for (LibraryItem i : items)
            System.out.println(i.getDetails() + ": " + i.getLoanDuration() + " days");
    }
}