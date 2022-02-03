package ch14.movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Movie {
    private  long id;
    private String title;
    private String genre;
    private static final File file = new File("movies.txt");

    public Movie(long id, String title , String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public static ArrayList<Movie> findAll() throws IOException {

        ArrayList<Movie> movies = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;


        while ((line = br.readLine()) != null) {

            String[] temp = line.split(",");
            Movie m = new Movie(Long.parseLong(temp[0]) , temp[1] , temp[2]);
            movies.add(m);
        }

        br.close();
        return  movies;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
