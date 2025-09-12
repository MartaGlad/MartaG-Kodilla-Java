package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        Set<Book> books = new HashSet<>();

        Book b1 = new Book("t1", "a1", LocalDate.of(1990, 1, 1));
        Book b2 = new Book("t2", "a2", LocalDate.of(2000, 3, 30));
        Book b3 = new Book("t3", "a3", LocalDate.of(2016, 11, 21));
        books.add(b1);
        books.add(b2);
        books.add(b3);
        library.getBooks().addAll(books);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        /*Set<Book> result = library.getBooks();*/
        library.getBooks().remove(b1);

        //Then
       /*assertEquals(3, result.size());*/
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
