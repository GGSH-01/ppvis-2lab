package com.company;

import java.util.Map;

public interface Catalogue {
    public Map<String, Book> Books();
    public Book BookData(String name);
    public void EditBook(Book book);
    public void BorrowBook(String userName, String book);
    public void ReturnBook(String userName, String book);

}
