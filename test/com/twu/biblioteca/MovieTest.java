package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie;
    @Before
    public void setUp() throws Exception {
        movie = new Movie("Interstellar",2001,"christopher","9");

    }

    @Test
    public void getName() {
        assertEquals("test for getName","Interstellar",movie.getName());
    }

    @Test
    public void setName() {
        movie.setName("Inception");
        assertEquals("test for setName","Inception",movie.getName());
    }

    @Test
    public void getYear() {
        assertEquals("test for getYear",2001,movie.getYear());
    }

    @Test
    public void setYear() {
        movie.setYear(2004);
        assertEquals("test for setYear",2004,movie.getYear());
    }

    @Test
    public void setDirector() {
        movie.setDirector("Jim");
       assertEquals("test for setDirector","Jim",movie.getDirector());
    }

    @Test
    public void getDirector() {
        assertEquals("test for getDirector","christopher",movie.getDirector());
    }

    @Test
    public void setRating() {
        movie.setRating("8");
        assertEquals("test for setRating","8",movie.getRating());
    }

    @Test
    public void getRating() {
        assertEquals("test for getRating","9",movie.getRating());
    }

    @Test
    public void equals() {
        Movie movie1 = new Movie("Interstellar",2001,"christopher","9");
        assertEquals("test for equals",true,movie1.equals(movie));
    }
}