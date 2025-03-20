package Week_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Film {

    //A film object will have 4 properties
    private String name;
    private int publicationYear;
    private String movieGenre;
    private double IMDBPoint;

    //Constructor method
    public Film(String name, int publicationYear, String movieGenre, double IMDBPoint) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.movieGenre = movieGenre;
        this.IMDBPoint = IMDBPoint;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getIMDBPoint() {
        return IMDBPoint;
    }

    // toString method for printing film
    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", movieGenre='" + movieGenre + '\'' +
                ", IMDBPoint=" + IMDBPoint +
                '}';
    }
}
