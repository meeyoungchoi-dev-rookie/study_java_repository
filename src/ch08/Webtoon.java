package ch08;

public class Webtoon {
    static  int webtoonCount = 0;

    private  String title;
    private  String genre;
    private  String author;

    Webtoon(String t , String g , String a) {
        title = t;
        genre = g;
        author = a;
        Webtoon.webtoonCount += 1;
    }

    @Override
    public String toString() {
        return "Webtoon{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
