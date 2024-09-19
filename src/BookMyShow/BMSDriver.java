package BookMyShow;

import BookMyShow.Search.Catalog;
import BookMyShow.movie.Movie;

import java.util.List;

public class BMSDriver {
    public static void main(String [] args) {

        // Create a user

        // Create a few movies
        createMovies();

        // Create a cinama Hall

        // Create a show which would have the movie in it

        // Create a seat list

        // Search for movies

        Catalog catalog = Catalog.getInstance();
        List<Movie> movies = catalog.searchByCity("BANGLORE");

        for(Movie m: movies){
            System.out.println(m.getTitle());
        }

        // Create a booking with show, seats, person

    }

    private static void createMovies() {
        Catalog catalog = Catalog.getInstance();
        Movie  movie = new Movie();
        movie.setId(1);
        movie.setTitle("Stree");
        movie.setCity("BANGLORE");
        movie.setLanguage("ENGLISH");

        catalog.addMovie(movie);

        movie.setId(2);
        movie.setTitle("BAHUBALI");
        movie.setCity("DELHI");
        movie.setLanguage("HINDI");
        catalog.addMovie(movie);


    }



}
