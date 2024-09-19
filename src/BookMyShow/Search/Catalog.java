package BookMyShow.Search;

import BookMyShow.movie.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {

    HashMap<String , List<Movie>> movieTitles;
    HashMap<String , List<Movie>> movieLanguages;
    HashMap<String , List<Movie>> movieCity;
    HashMap<String , List<Movie>> movieGenre;
    HashMap<Date, List<Movie>> movieReleaseDates;


    private Catalog() {
        movieLanguages = new HashMap<>();
        movieTitles = new HashMap<>();
        movieCity = new HashMap<>();
        movieGenre = new HashMap<>();
        movieReleaseDates = new HashMap<>();
    }

    public static Catalog instance = null;

    public static  Catalog getInstance(){
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }


    public void addMovie(Movie movie) {

        List<Movie> movies = movieTitles.getOrDefault(movie.getTitle(), new ArrayList<>());
        movies.add(movie);
        movieTitles.put(movie.getTitle(), movies);

        movies = movieLanguages.getOrDefault(movie.getLanguage(), new ArrayList<>());
        movies.add(movie);
        movieLanguages.put(movie.getLanguage(), movies);

        movies = movieCity.getOrDefault(movie.getCity(), new ArrayList<>());
        movies.add(movie);
        movieCity.put(movie.getCity(), movies);

        movies = movieGenre.getOrDefault(movie.getGenre(), new ArrayList<>());
        movies.add(movie);
        movieGenre.put(movie.getGenre(), movies);

        movies = movieReleaseDates.getOrDefault(movie.getReleaseDate(), new ArrayList<>());
        movies.add(movie);
        movieReleaseDates.put(movie.getReleaseDate(), movies);
    }



    @Override
    public List<Movie> searchByTitle(String title) {
        return movieTitles.getOrDefault(title, null);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.getOrDefault(language, null);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return movieGenre.getOrDefault(genre, null);
    }

    @Override
    public List<Movie> searchByReleaseDate(Date releaseDate) {
        return movieReleaseDates.getOrDefault(releaseDate, null);
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return movieCity.getOrDefault(cityName, null);
    }
}
