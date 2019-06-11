package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;
    @Before
    public void setUp() throws Exception {
        user = new User("Arthur","222-2222","arthur101","arthur@outlook.com","222-345-5555");
    }

    @Test
    public void setEmail() {
        user.setEmail("arthur1@outlook.com");
        assertEquals("test for setEmail","arthur1@outlook.com",user.getEmail());
    }

    @Test
    public void getEmail() {
        assertEquals("test for getEmail","arthur@outlook.com",user.getEmail());
    }

    @Test
    public void setPhoneNumber() {
        user.setPhoneNumber("333-333-3333");
        assertEquals("test for setPhoneNumber","333-333-3333",user.getPhoneNumber());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("test for getPhoneNumber","222-345-5555",user.getPhoneNumber());
    }

    @Test
    public void getName() {
        assertEquals("test for getName","Arthur",user.getName());
    }

    @Test
    public void setName() {
        user.setName("Tom");
        assertEquals("test for setName","Tom",user.getName());
    }

    @Test
    public void getLibraryNumber() {
        assertEquals("test for library number","222-2222",user.getLibraryNumber());
    }

    @Test
    public void setLibraryNumber() {
        user.setLibraryNumber("333-3333");
        assertEquals("test for set library number","333-3333",user.getLibraryNumber());
    }

    @Test
    public void addCheckedOutMovie() {
        user.addCheckedOutMovie(new Movie("Interstellar",2014,"Christopher Nolan","8.6"));
         assertEquals("test for addCheckedOutMovie",1,user.getCheckedOutMovies());
    }

    @Test
    public void addcheckedOutBook() {
        user.addcheckedOutBook(new Book("Algebra 101","Tom",1997));
        assertEquals("test for addcheckedoutbook,",1,user.getCheckedoutBooks());
    }

    @Test
    public void removeCheckedOutBook() {
        Book book = new Book("Algebra 101","Tom",1997);
        user.addcheckedOutBook(book);
        user.removeCheckedOutBook(book);
        assertEquals("test for removeCheckedOutBook",0,user.getCheckedoutBooks());
    }

    @Test
    public void removeCheckedOutMovie() {
        Movie movie = new Movie("Interstellar",2014,"Christopher Nolan","8.6");
        user.addCheckedOutMovie(movie);
        user.removeCheckedOutMovie(movie);
        assertEquals("test for removeCheckedOutBook",0,user.getCheckedOutMovies());
    }

    @Test
    public void getCheckedoutBooks() {
        Book book = new Book("Algebra 101","Tom",1997);
        user.addcheckedOutBook(book);
        assertEquals("test for getcheckedoutbooks",1,user.getCheckedoutBooks());

    }

    @Test
    public void getPassword() {
        assertEquals("test for getPassword","arthur101",user.getPassword());
    }

    @Test
    public void setPassword() {
        user.setPassword("arthur");
        assertEquals("test for setPassword","arthur",user.getPassword());
    }

    @Test
    public void equals1() {
     User user1 = new User("Arthur","222-2222","arthur101","arthur@outlook.com","222-345-5555");
     assertEquals("test for equals",true,user.equals(user1));
    }

    @Test
    public void toString1() {
        assertEquals("test for toString","Arthur arthur@outlook.com 222-345-5555",user.toString());
    }
}