package pl.brightworks.libman.domain.library;

import pl.brightworks.libman.domain.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<LibraryItem> libraryItems = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book, Place place) {
        libraryItems.add(new LibraryItem(book, place));
    }

    public String getName() {
        return name;
    }
}
