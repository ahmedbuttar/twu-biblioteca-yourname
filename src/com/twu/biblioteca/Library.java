package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Books books;
    Movies movies;
    Users users;
    Library(){
        books = new Books();
        movies = new Movies();
        users = new Users();
    }

    public void showMessage() {
        System.out.println("Welcome to Biblioteca, Your one-stop-shop for great book titles in Bangalore!\n");
        login();

    }

    public void login(){
        System.out.println("Please enter you library number to login");
        Scanner scanner = new Scanner(System.in);
        String libraryNumber=scanner.nextLine();
        System.out.println("Please enter you password");
        String password = scanner.nextLine();
        boolean isLoginSuccessful = users.login(libraryNumber,password);
        if(isLoginSuccessful){
            showMenu();
        }else{
            login();
        }
    }



    public void showMenu() {
        System.out.println("1. Show list of all books\n2. Show list of all Movies\n3. check-out book\n4. return book\n5. check-out movie\n6. return movie\n7. show user info\n8. quit\n\nEnter number to select menu option");
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
                checkoutBook();
                break;
            case 4:
                returnBook();
                break;
            case 5:
                checkoutMovie();
                break;
            case 6:
                returnMovie();
                break;
            case 7:
                users.showCurrentUser();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }
    }
    private void checkoutBook(){
        Book book = books.checkoutBook();
        if(book!=null){
            users.loggedInUser.addcheckedOutBook(book);
        }
    }
    private void returnBook(){
        Book book = books.returnBook();
        if(book!=null){
            users.loggedInUser.removeCheckedOutBook(book);
        }
    }
    private void checkoutMovie(){
        Movie movie = movies.checkoutMovie();
        if(movie!=null){
            users.loggedInUser.addCheckedOutMovie(movie);
        }
    }
    private void returnMovie(){
        Movie movie = movies.returnMovie();
        if(movie!=null){
            users.loggedInUser.removeCheckedOutMovie(movie);
        }
    }





}
