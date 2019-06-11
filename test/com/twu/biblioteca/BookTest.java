package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;
    @Before
    public void setUp() throws Exception {
        book = new Book("java","arthur",2001);
    }

    @Test
    public void getName() {
        assertEquals("test for getName","java",book.getName());
    }

    @Test
    public void setName() {
        book.setName("math");
        assertEquals("test for setName","math",book.getName());
    }

    @Test
    public void getAuthor() {
        assertEquals("test for getName","arthur",book.getAuthor());
    }

    @Test
    public void setAuthor() {
        book.setAuthor("Jim");
        assertEquals("test for setAuthor","Jim",book.getAuthor());

    }

    @Test
    public void getPublished() {
        assertEquals("test for getPublished",2001,book.getPublished());
    }

    @Test
    public void setPublished() {
        book.setPublished(2002);
        assertEquals("test for setPublished",2002,book.getPublished());
    }

    @Test
    public void equals() {
        Book book1 = new Book("java","arthur",2001);
        assertEquals("test for equals",true,book.equals(book1));
    }
}