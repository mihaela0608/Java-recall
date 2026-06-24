package LibrarySystem;

public class Book {
    private static int ID = 0;
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.id = ++ID;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean borrowed){
        this.isBorrowed = borrowed;
    }
}
