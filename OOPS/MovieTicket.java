package com.oops;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

interface Search {
    void searchbyTitle(String title);
    void searchbyLanguage(String language);
    void searchbyGenre(String genre);
    void searchbyReleaseDate(Date reldate);
    void searchbyCity(String city);
}

class Catalog implements Search {
    private static Date lastUpdated;
    private static List<Movie> MovieList = new ArrayList<>();

    public void addMovie(Movie M) {
        MovieList.add(M);
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todaysDate = dateFormat.format(date);
        System.out.println("Today's Date: " + todaysDate);
        lastUpdated = date;
    }

    public void listMovie() {
        for (Movie movie : MovieList) {
            movie.getMovieDetail();
        }
    }

    public void deleteMovie(String title) {
        MovieList.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title));
    }

    @Override
    public void searchbyTitle(String title) {
        for (Movie movie : MovieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchbyLanguage(String language) {
        for (Movie movie : MovieList) {
            if (movie.getLanguage().equalsIgnoreCase(language)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchbyGenre(String genre) {
        for (Movie movie : MovieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchbyReleaseDate(Date reldate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Movie movie : MovieList) {
            if (sdf.format(movie.getReleaseDate()).equals(sdf.format(reldate))) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchbyCity(String city) {
        for (Movie movie : MovieList) {
            if (movie.getCity().equalsIgnoreCase(city)) {
                movie.getMovieDetail();
            }
        }
    }
}

class Movie {
    private String title;
    private String language;
    private String genre;
    private Date releaseDate;
    private String city;

    public Movie(String title, String language, String genre, Date releaseDate, String city) {
        this.title = title;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getCity() {
        return city;
    }

    public void getMovieDetail() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Title: " + title);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genre);
        System.out.println("Release Date: " + sdf.format(releaseDate));
        System.out.println("City: " + city);
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Movie m1 = new Movie("Inception", "English", "Sci-Fi", new Date(), "New York");
        Movie m2 = new Movie("Interstellar", "English", "Sci-Fi", new Date(), "Los Angeles");

        catalog.addMovie(m1);
        catalog.addMovie(m2);

        System.out.println("\nListing All Movies:");
        catalog.listMovie();

        System.out.println("\nSearching by Title (Inception):");
        catalog.searchbyTitle("Inception");

        System.out.println("\nDeleting Movie: Interstellar");
        catalog.deleteMovie("Interstellar");

        System.out.println("\nListing Movies After Deletion:");
        catalog.listMovie();
    }
}
