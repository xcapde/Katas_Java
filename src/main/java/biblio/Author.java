package biblio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Author {
    private String name;
    private Set<Book> bookList = new HashSet<>();

    public int countBooks(){
        return this.bookList.size();
    }

    public void addBook(Book book){
//        if (this.bookList.contains(book)) return; --> Ho substituïm amb el Set fila 9 enlloc del List.
        this.bookList.add(book);
    }
}
