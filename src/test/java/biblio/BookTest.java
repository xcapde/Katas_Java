package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @BeforeEach
    void setUp(){
    }

    @Test
    void bookCanCreateWithAttributes(){
        Author author = new Author();
        Book book = new Book("Fall of Giants", author);
        assertEquals("Fall of Giants",book.getTitle());
        assertEquals(author,book.getAuthor());
    }

    @Test
    void checkIfBookIsRented(){
        Author author = new Author();
        Book book = new Book("Fall of Giants", author);
        boolean result = book.isRented();

        assertFalse(result);
    }
}