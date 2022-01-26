package ch10;

public class Circle extends  Shape {
    int radius;

    @Override
    double area() {
        return radius * radius * Math.PI;
    }
}
