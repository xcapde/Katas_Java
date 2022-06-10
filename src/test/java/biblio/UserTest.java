package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp(){
    }

    @Test
    void userCanRentBooks(){
        var author = new Author();
        var book = new Book ("title", author);
        var user = new User ();
        user.rentBook(book);
        assertEquals(true,book.isRented());
    }

    @Test
    void countBooksRentedByUser(){
        Author author = new Author();
        Book book = new Book ("title", author);
        Book book2 = new Book ("title2", author);
        User user = new User();
        user.rentBook(book);
        user.rentBook(book2);

        assertEquals(2,user.countRentedBooks());
    }
}