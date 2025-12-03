package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book b1 = new Book ("a1", "t1", 1999, "mhjuug56");
        Book b2 = new Book ("a2", "t2", 1986, "gjbhug6");
        Book b3 = new Book ("a3", "t3", 1999, "bnjdnfj");
        Book b4 = new Book ("a4", "t4", 2022, "nccszsf");
        Book b5 = new Book ("a5", "t5", 2000, "jeieur");
        Book b6 = new Book ("a6", "t6", 2004, "jnfjkewjff");
        Collections.addAll(bookSet, b1, b2, b3, b4, b5, b6);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        //1986, 1999, 1999, 2000, 2004, 2022
        //Then
        assertEquals(2000, medianPublicationYear );
    }
}
