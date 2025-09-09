package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    //private /*final*/ LibraryDbController libraryDbController; //jak jest final to nie może
    // być bezparametrowy konstruktor

    @Autowired
    private LibraryDbController libraryDbController;//wstrzykiwanie zależności bezpośrednio do pola klasy

    /*@Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){

    }*/

    /*@Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
