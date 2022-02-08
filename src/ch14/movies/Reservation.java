package ch14.movies;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
    private long id;
    private long movieId;
    private String movieTitle;
    private String seatName;
    private static final File file = new File("reservations.txt");

    public String getSeatName() {
        return seatName;
    }

    public Reservation(long id , long movieId , String movieTitle , String seatName) {
        this.id = id;
        this.movieId = movieId;
        this.seatName = seatName;
    }

    public static Reservation findById(String reservationId) throws IOException {

        Reservation r = null;

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = null;

        while ((line = br.readLine()) != null) {

            String[] temp = line.split(",");
            if (reservationId.equals(temp[0])) {
                r = new Reservation(
                        Long.parseLong(temp[0]),
                        Long.parseLong(temp[1]),
                        temp[2],
                        temp[3]
                );
            };
            break;
        }

        br.close();
        return r;
    }

    public static Reservation cancel(String reservationId) throws  IOException{

        Reservation cancled = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line = null;

        while ((line = br.readLine()) != null) {

            String[] temp = line.split(",");
            if (reservationId.equals(temp[0])) {

                cancled = new Reservation(Long.parseLong(temp[0]) , Long.parseLong(temp[1]) , temp[2], temp[3]);


            };
            continue;
        }
        br.close();
        text += line + "\n";

        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
        return cancled;
    }


    public static ArrayList<Reservation> findByIdMovie(String movieIdStr) throws IOException{


        ArrayList<Reservation> reservations = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while ((line = br.readLine()) != null) {

            String[] temp = line.split(",");
            if (movieIdStr.equals(temp[1])) {
                long id = Long.parseLong(temp[0]);
                long movieId = Long.parseLong(temp[1]);
                String moveTitle = temp[2];
                String seatName = temp[3];
                Reservation r = new Reservation(id, movieId, moveTitle, seatName);
                reservations.add(r);
            }
        }
        br.close();
        return reservations;
    }

    public Reservation(long movieId , String movieTitle, String seatName) {
        this.id = Instant.now().toEpochMilli();
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    @Override
    public String toString() {
        return String.format("영화: " + movieTitle + " , 좌석: " + seatName);
    }

    public void save() throws IOException {
        FileWriter fw =  new FileWriter(file, true);
        fw.write(this.toFileString() + "\n");
        fw.close();
    }

    private String toFileString() {
        return String.format("%d , %d, %s, %s", id, movieId , movieTitle ,seatName);
    }

    public long getId() {
        return id;
    }
}
