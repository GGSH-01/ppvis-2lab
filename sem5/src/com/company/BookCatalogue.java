package com.company;

import java.util.HashMap;
import java.util.Map;

public class BookCatalogue implements Catalogue {
    public Book[] books;

    @Override
    public Map<String, Book> Books() {
        Map<String, Book> books = new HashMap<String, Book>();
        books.put("ааааааааааа", new Book());
        return books;
    }

    @Override
    public Book BookData(String name) {
        Book book = new Book();
        return book;
    }

    @Override
    public void EditBook(Book book) {

    }

    @Override
    public void BorrowBook(String userName, String book) {

    }

    @Override
    public void ReturnBook(String userName, String book) {

    }
}
