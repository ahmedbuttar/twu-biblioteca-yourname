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
        System.out.println("1. Show list of all books\n2. Show list of all Movies\n3. check-out book\n4. return book\n5. check-out movie\n6. return movie\n7. quit\n\nEnter number to select menu option");
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
                movies.showMovies();
                break;
            case 3:
                books.checkoutBook();
                break;
            case 4:
                books.returnBook();
                break;
            case 5:
                movies.checkoutMovie();
                break;
            case 6:
                movies.returnMovie();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }
    }






}
