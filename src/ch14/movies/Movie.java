package ch14.movies;

import java.io.*;
import java.util.ArrayList;

public class Movie {
    private  long id;
    private String title;
    private String genre;
    private static final File file = new File("./movies.txt");

    public Movie(String title , String genre) {
        this.title = title;
        this.genre = genre;
    }



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

            System.out.println(line);

            String[] temp = line.split(",");

            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i] + " ");
            }



            Movie m = null;
            if (temp[2].equals(null)) {
                m = new Movie(temp[0] , temp[1]);
            } else {
                m = new Movie(Long.parseLong(temp[0]) , temp[1] , temp[2]);
            }

            movies.add(m);
        }

        br.close();
        return  movies;
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter(file , true);

        fw.write(this.toFileString() + "\n");
        fw.close();
    }


    private String toFileString() {
        return String.format("%d,%s,%s", id , title , genre);
    }


    public static void delete(String movieId) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line = null;

        while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");

                if (movieId.equals(temp[0])) {
                    continue;
                }
                text += line + "\n";


                br.close();

                FileWriter fw = new FileWriter(file);

                fw.write(text);
                fw.close();
        }
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
