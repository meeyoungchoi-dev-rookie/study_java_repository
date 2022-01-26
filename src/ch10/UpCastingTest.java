package ch10;

public class UpCastingTest {
    public static void main(String[] args) {

        Square s = new Square();
        s.name = "정사각형";

        Triangle t = new Triangle();
        t.name = "삼각형";

        Circle c = new Circle();
        c.name = "원";

        Shape[] shapes = {s , t, c};

        for (Shape data : shapes) {
            System.out.println("도형: " + data.name);
        }







    }
}
