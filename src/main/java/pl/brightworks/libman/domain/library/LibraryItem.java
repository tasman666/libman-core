package pl.brightworks.libman.domain.library;

import pl.brightworks.libman.domain.book.Book;

public class LibraryItem {
    private final Book book;
    private final Place place;

    public LibraryItem(Book book, Place place) {
        this.book = book;
        this.place = place;
    }
}
