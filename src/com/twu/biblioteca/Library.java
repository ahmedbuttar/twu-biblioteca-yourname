package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Books books;
    Movies movies;

    Library(){
        books = new Books();
        movies = new Movies();
    }

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
                books.showBooks();
                break;
            case 2:
                books.checkoutBook();
                break;
            case 3:
                books.returnBook();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }
    }






}
