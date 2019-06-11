package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    static ArrayList<Movie> movies = new ArrayList<Movie>();
    static ArrayList<Movie> checkedoutMovies = new ArrayList<Movie>();

    static {
        Movie movie = new Movie("Interstellar",2014,"Christopher Nolan","8.6");
        Movie movie1 = new Movie("Inception",2010,"Christopher Nolan","8.8");
        Movie movie2 = new Movie("",2014,"Christopher Nolan","8.6");
        movies.add(movie);
        movies.add(movie1);
        movies.add(movie2);

    }

    private Movie prepareMovie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter movie year");
        int movieYear = scanner.nextInt();
        Movie movie = new Movie(movieName,movieYear,null,null);
        return movie;

    }
    public void showMovies() {
        ArrayList<Movie> array = movies;
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ", " + array.get(i).getDirector() + ", " + array.get(i).getYear()+" "+array.get(i).rating);
        }

    }
    private Movie getMovie(Movie movie){
        for(int i=0;i<movies.size();i++){
            if(movies.get(i).equals(movie)){
                return movies.get(i);
            }
        }
        return null;
    }
    //takes in a book object and returns an object with same attributes from checked-out-books array
    private Movie getCheckedOutBook(Movie movie){
        for(int i=0;i<checkedoutMovies.size();i++){
            if(checkedoutMovies.get(i).equals(movie)){
                return checkedoutMovies.get(i);
            }
        }
        return null;
    }
    private void checkoutMovie(){
        Movie userMovie = prepareMovie();
        Movie checkoutMovie = getMovie(userMovie);
        if(checkoutMovie!=null){
            movies.remove(checkoutMovie);
            checkedoutMovies.add(checkoutMovie);
            System.out.println("Thank you! Enjoy the Movie");
        }else{
            System.out.println("Sorry, that movie is not available");
        }
    }
    private void returnMovie(){
        Movie userMovie = prepareMovie();
        Movie returnMovie = getCheckedOutBook(userMovie);
        if (returnMovie!=null) {
            movies.add(returnMovie);
            checkedoutMovies.remove(returnMovie);
            System.out.println("Thank you for returning the movie");
        } else {
            System.out.println("This is not a valid movie to return");
        }
    }
}
