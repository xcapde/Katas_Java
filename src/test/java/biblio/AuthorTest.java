package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @BeforeEach
    void setUp(){
    }

    @Test
    void authorCanCountItsBooks(){
        Author author = new Author();
        Book book = new Book ("title", author);
        assertEquals(1,author.countBooks());
    }

    @Test
    void authorCanAddBooks(){
        var author = new Author();
        var book = new Book ("title", author);
        author.addBook(book);
        assertEquals(1,author.countBooks());
    }

    // 1. Necessitem un usuari
    // 2. El llibre s'ha de poder llogar (només 1 vegada)
    // 3. El llibre s'ha de poder veure si està llogat
    // 4. S'han de poder contar els llibres que té l'usuari llogats.
}