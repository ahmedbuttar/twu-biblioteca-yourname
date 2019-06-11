package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String name;
    private String libraryNumber;
    private String password;
    private String phoneNumber;
    private String email;
    private ArrayList<Movie> checkedoutMovies;
    private ArrayList<Book> checkedoutBooks;

    User(String name,String libraryNumber,String password,String email,String phoneNumber){
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        checkedoutBooks = new ArrayList<Book>();
        checkedoutMovies = new ArrayList<Movie>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }
    public void addCheckedOutMovie(Movie movie){
        this.checkedoutMovies.add(movie);
    }
    public void addcheckedOutBook(Book book){
        this.checkedoutBooks.add(book);
    }
    public void removeCheckedOutBook(Book book){
        this.checkedoutBooks.remove(book);
    }
    public void removeCheckedOutMovie(Movie movie){
        this.checkedoutMovies.remove(movie);
    }
    public int getCheckedoutBooks(){
        return checkedoutBooks.size();
    }
    public int getCheckedOutMovies(){
        return checkedoutMovies.size();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean equals(User user){
        return libraryNumber.equals(user.libraryNumber);
    }
    public String toString(){
        return name+" "+email+ " "+ phoneNumber;
    }

}
