package ch10;

public class AreaCalculator {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.name = "삼각형";
        t.width = 3;
        t.height = 4;

        Square s = new Square();
        s.name = "정사각형";
        s.length = 3;

        Circle c = new Circle();
        c.name = "원";
        c.radius = 4;


        Shape[] shapes  = {t , s , c};

        for (Shape shape : shapes) {
            System.out.println("shape: " + shape.name + "의 넓이: " + String.format("%.2f", shape.area()));
        }



    }
}
