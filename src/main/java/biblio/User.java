package biblio;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Set<Book> booksRentedList = new HashSet<>();

    public void rentBook(Book book){
        if(!book.isRented()){
            this.booksRentedList.add(book);
            book.setRented(true);
        } return;
    }

    public int countRentedBooks(){
        return this.booksRentedList.size();
    }
}

// 1. Necessitem un usuari
// 2. El llibre s'ha de poder llogar (només 1 vegada)
// 3. El llibre s'ha de poder veure si està llogat
// 4. S'han de poder contar els llibres que té l'usuari llogats.