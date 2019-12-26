package com.company;

public class User {
    public String Name;
    public String DateBorrowed;
    public Book Borrowed;

    public boolean TakeBook(Book book){
        return true;
    }
    public Book ReturnBook(){
        Book book = new Book();
        return book;
    }
}
