package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void showMessage() {
        System.out.println("Welcome to Biblioteca, Your one-stop-shop for great book titles in Bangalore! \n");
    }

    public static void showMenu() {
        System.out.println("1. Show list of all books\n2. check-out book\n3. return book\n4. quit\n\nEnter number to select menu option");
    }

    public static void selectedMenu(Scanner in) {
        switch (in.nextInt()) {
            case 1:
                showBooks();
                showMenu();
                selectedMenu(in);
                break;
            case 2:
                checkoutBook(prepareBook());
                showMenu();
                selectedMenu(in);
                break;
            case 3:
                returnBook(prepareBook());
                showMenu();
                selectedMenu(in);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option selected");
                showMenu();
                selectedMenu(in);
                break;
        }
    }

    public static void showBooks() {
        ArrayList<Book> array = Books.books;
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ", " + array.get(i).getAuthor() + ", " + array.get(i).getPublished());
        }

    }
    public static Book prepareBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name");
        String name = scanner.nextLine();
        System.out.println("Enter author name");
        String publisher = scanner.nextLine();
        System.out.println("Enter year published");
        int yearPublished = scanner.nextInt();
        return new Book(name,publisher,yearPublished);

    }
    public static Book getBook(Book book){
        for(int i=0;i<Books.books.size();i++){
            if(Books.books.get(i).equals(book)){
                return Books.books.get(i);
            }
        }
        return null;
    }
    public static Book getCheckedOutBook(Book book){
        for(int i=0;i<Books.checkedoutBooks.size();i++){
            if(Books.checkedoutBooks.get(i).equals(book)){
                return Books.checkedoutBooks.get(i);
            }
        }
        return null;
    }
    public static void checkoutBook(Book book){
        Book checkoutBook = getBook(book);
        if(checkoutBook!=null){
            Books.books.remove(checkoutBook);
            Books.checkedoutBooks.add(checkoutBook);
            System.out.println("Thank you! Enjoy the book");
        }else{
            System.out.println("Sorry, that book is not available");
        }
    }
    public static void returnBook(Book book) {
        Book returnBook = getCheckedOutBook(book);
        if (returnBook!=null) {
            Books.books.add(returnBook);
            Books.checkedoutBooks.remove(returnBook);
            System.out.println("Thank you for returning the book");
        } else {
            System.out.println("This is not a valid book to return");
        }
    }
}
