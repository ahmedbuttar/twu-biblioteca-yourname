package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

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

    //if book is present in the books array function removes it and adds it to the checked-out-book array
    public Book checkoutBook(){
        Book userBook = prepareBook();
        Book checkoutBook = getBook(userBook);
        if(checkoutBook!=null){
            books.remove(checkoutBook);
            Books.checkedoutBooks.add(checkoutBook);
            System.out.println("Thank you! Enjoy the book");
            return checkoutBook;
        }else{
            System.out.println("Sorry, that book is not available");
            return null;
        }
    }
    //if book is present in the checked-out-books array function removes it and adds it to the books array
    public Book returnBook() {
        Book userBook = prepareBook();
        Book returnBook = getCheckedOutBook(userBook);
        if (returnBook!=null) {
            books.add(returnBook);
            checkedoutBooks.remove(returnBook);
            System.out.println("Thank you for returning the book");
            return returnBook;
        } else {
            System.out.println("This is not a valid book to return");
            return null;
        }
    }
    //prints the available books
    public void showBooks() {
        ArrayList<Book> array = Books.books;
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ", " + array.get(i).getAuthor() + ", " + array.get(i).getPublished());
        }

    }

    //takes in a user book object and returns an object with same attributes from books array
    private Book getBook(Book book){
        for(int i=0;i<books.size();i++){
            if(books.get(i).equals(book)){
                return Books.books.get(i);
            }
        }
        return null;
    }
    //takes in a book object and returns an object with same attributes from checked-out-books array
    private Book getCheckedOutBook(Book book){
        for(int i=0;i<Books.checkedoutBooks.size();i++){
            if(Books.checkedoutBooks.get(i).equals(book)){
                return Books.checkedoutBooks.get(i);
            }
        }
        return null;
    }
    //takes in user input and creates a book object to checkout or return
    private Book prepareBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name");
        String name = scanner.nextLine();
        System.out.println("Enter author name");
        String publisher = scanner.nextLine();
        System.out.println("Enter year published");
        int yearPublished = scanner.nextInt();
        return new Book(name,publisher,yearPublished);
    }


}
