package com.company;

public class BookBuilder implements BookCreator{
    public Book result;

    public Book Book(){
        Book book = new Book();
        return book;
    };
}
