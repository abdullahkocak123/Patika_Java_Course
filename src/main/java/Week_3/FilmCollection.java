package Week_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmCollection {
    public static void main(String[] args) {

        //Generate a collection of 5 films
        List<Film> filmCollection = new ArrayList<>();

        Film film1 = new Film("The Dark Knight", 2008, "Action", 9.0);
        Film film2 = new Film("Forest Gump", 1994, "Epic", 8.8);
        Film film3 = new Film("The Shawshank Redemption", 1994, "Epic", 9.3);
        Film film4 = new Film("The Lord of The Rings", 2003, "Action Epic", 9.0);
        Film film5 = new Film("Fight Club", 1999, "Drama", 8.8);

        filmCollection.add(film1);
        filmCollection.add(film2);
        filmCollection.add(film3);
        filmCollection.add(film4);
        filmCollection.add(film5);

        //Sorting films by IMDB score descending
        FilmCollection.sortByIMDBPointDescending(filmCollection);
        System.out.println("Films sorted by IMDB point (Descending): ");
        for (Film film : filmCollection) {
            System.out.println(film.getName());
        }

        System.out.println("------------------");

        //Sorting films by Publication Year
        FilmCollection.sortByPublicationYear(filmCollection);
        System.out.println("Films sorted by Publication Year: ");
        for (Film film : filmCollection) {
            System.out.println(film.getName());
        }

        System.out.println("------------------");

        //Filtering films according to type
        System.out.println("Films filtered by Genre-> Epic : ");
        System.out.println(moviesFilteredByGenre(filmCollection, "Epic"));

    }

    //Method for sorting films by IMDB score descending
    public static void sortByIMDBPointDescending(List<Film> films) {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film film1, Film film2) {
                return Double.compare(film2.getIMDBPoint(), film1.getIMDBPoint());
            }
        });
        //Collections.sort(films, (film1, film2) -> Double.compare(film2.getIMDBPoint(), film1.getIMDBPoint()));
    }

    //Method for sorting films by public year
    public static void sortByPublicationYear(List<Film> films) {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film film1, Film film2) {
                return Integer.compare(film1.getPublicationYear(), film2.getPublicationYear());
            }
        });
        //Collections.sort(films, (film1, film2) -> Integer.compare(film1.getPublicationYear(), film2.getPublicationYear()));
    }

    //Method for filtering films by type
    public static List<Film> moviesFilteredByGenre(List<Film> films, String genre) {
        List<Film> filteredFilms = new ArrayList<>();
        for (Film film : films) {
            if (film.getMovieGenre().equalsIgnoreCase(genre)) {
                filteredFilms.add(film);
            }
        }
        return filteredFilms;
    }

    /*
    //Alternative solution with Stream API
    public static List<Film> moviesFilteredByGenre(List<Film> films, String genre){
        return films.stream()
                .filter(film -> film.getMovieGenre().equalsIgnoreCase(genre)) //Filtering according to Genre
                .collect(Collectors.toList()); //Collecting results to a list

    }
     */
}
