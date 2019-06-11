package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {
        Library library = new Library();
        library.showMessage();
        library.showMenu();
        Scanner in = new Scanner(System.in);
        library.selectedMenu(in);
    }

}