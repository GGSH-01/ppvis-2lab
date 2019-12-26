package com.company;

import java.util.Scanner;

public class Client {
    private Librarian[] librarians;
    private User[] users;

    Client(){
        Scanner sc = new Scanner(System.in);
        System.out.println("авторицзация. читатель, библиотекарь, выход");
        String authorize;
        authorize = sc.nextLine();
        Authorize(authorize);
    }

    public void Authorize(String string){
        if (string.equals("библиотекарь")){
            System.out.println("вошли как библиотекарь");
            System.out.println("вошли как читатель");
            System.out.println("1--распечатать список книг \n 2--распечать информацию о книге \n 3--добавить книгу \n 4--удалить книгу \n 5--изменить книгу \n 6--деавторизоваться");

        }
        if (string.equals("читатель")){
            System.out.println("вошли как читатель");
            System.out.println("1--распечатать список книг \n 2--распечать информацию о книге \n 3--позаимствовать книгу \n 4--вернуть книгу \n 5--деавторизоваться");

        }
        if (string.equals("выход")){
            Exit();
        }

    }
    public void Deauthorise(){

    }
    public void PrintOptions(){

    }
    public void PrintBooks(){

    }
    public void PrintBookData(String name){

    }
    public void EditBook(String name){

    }
    public void BorrowBook(String userName, String book){

    }
    public void ReturnBook(String userName, String book){

    }
    public void Exit(){
        System.exit(0);
    }
}
