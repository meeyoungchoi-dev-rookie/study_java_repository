package 상속.ExcendsEx1;

public class SmartTv  extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
