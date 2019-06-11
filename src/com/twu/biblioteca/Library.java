package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {


    public void showMessage() {
        System.out.println("Welcome to Biblioteca, Your one-stop-shop for great book titles in Bangalore! \n");
    }

    public void showMenu() {
        System.out.println("1. Show list of all books\n2. check-out book\n3. return book\n4. quit\n\nEnter number to select menu option");
        Scanner scanner = new Scanner(System.in);
        selectedMenu(scanner.nextInt());
        showMenu();

    }

    private void selectedMenu(int n) {
        switch (n) {
            case 1:
                showBooks();
                break;
            case 2:
                checkoutBook(prepareBook());
                break;
            case 3:
                returnBook(prepareBook());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }
    }
    //prints the available books
    public void showBooks() {
        ArrayList<Book> array = Books.books;
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ", " + array.get(i).getAuthor() + ", " + array.get(i).getPublished());
        }

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
    //takes in a book object and returns an object with same attributes from books array
    private Book getBook(Book book){
        for(int i=0;i<Books.books.size();i++){
            if(Books.books.get(i).equals(book)){
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
    //if book is present in the books array function removes it and adds it to the checked-out-book array
    private void checkoutBook(Book book){
        Book checkoutBook = getBook(book);
        if(checkoutBook!=null){
            Books.books.remove(checkoutBook);
            Books.checkedoutBooks.add(checkoutBook);
            System.out.println("Thank you! Enjoy the book");
        }else{
            System.out.println("Sorry, that book is not available");
        }
    }
    //if book is present in the checked-out-books array function removes it and adds it to the books array
    private void returnBook(Book book) {
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
