package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private int published;

    Book(String name,String author,int published){
        this.name = name;
        this.author = author;
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPublished() {
        return published;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public boolean equals(Book book){
        return name.equals(book.name) && author.equals(book.author) && published==book.published;
    }

}
