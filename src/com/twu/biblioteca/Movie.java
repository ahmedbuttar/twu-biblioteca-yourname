package com.twu.biblioteca;

public class Movie {
    String name;
    int year;
    String director;
    String rating;

    Movie(String name,int year,String director,String rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
    public boolean equals(Movie movie){
        return name.equals(movie.name) && year == movie.year;
    }
}
