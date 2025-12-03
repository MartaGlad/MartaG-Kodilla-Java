package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier { //interfejs oczekiwany przez stary system

    @Override
    public int publicationYearMedian(Set<Book> bookSet) { //metoda ze starego interfejsu
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = new HashMap<>();
        for(Book book : bookSet) {
            bookMap.put(new BookSignature(book.getSignature()),
                        new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                                book.getAuthor(),
                                book.getTitle(),
                                book.getPublicationYear())
            );
        }
        return medianPublicationYear(bookMap); //metoda nowego interfejsu
    }
}
