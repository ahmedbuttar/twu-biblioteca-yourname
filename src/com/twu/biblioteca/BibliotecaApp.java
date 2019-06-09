package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        showMessage();
        showBooks();
    }


    public static void showMessage(){
        System.out.println("Welcome to Biblioteca, Your one-stop-shop for great book titles in Bangalore!");
    }
    public static void showBooks(){
        Book book = new Book("Algebra 101","Tom",1997);
        Book book1 = new Book("Java 101","Arthur",2001);
        Book book2 = new Book("Python 101","Jim",2004);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        books.add(book1);
        books.add(book2);

        for(int i = 0;i<books.size();i++){
            System.out.println(books.get(i).getName() + ", "+ books.get(i).getAuthor()+ ", "+books.get(i).getPublished());
        }

    }
}