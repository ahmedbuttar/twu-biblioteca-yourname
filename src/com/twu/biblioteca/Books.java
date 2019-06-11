package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    static ArrayList<Book> books = new ArrayList<Book>();
    static ArrayList<Book> checkedoutBooks = new ArrayList<Book>();
    static {
        Book book = new Book("Algebra 101","Tom",1997);
        Book book1 = new Book("Java 101","Arthur",2001);
        Book book2 = new Book("Python 101","Jim",2004);
        books.add(book);
        books.add(book1);
        books.add(book2);
    }

}
