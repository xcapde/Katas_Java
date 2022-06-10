package biblio;

public class Book {
    private Author author;
    private String title;
    private boolean rented = false;

    public Book(String title, Author author){
        author.addBook(this);
        this.author = author;
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }
}
