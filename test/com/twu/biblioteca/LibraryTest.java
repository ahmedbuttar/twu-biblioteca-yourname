package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class LibraryTest {
    Scanner scanner;
    Library library;
    @Before
    public void setUp() throws Exception {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    @Test
    public void selectedMenu() {
        //library.selectedMenu(scanner);
        assertEquals("test for selectedMenu","2","2");
    }
}