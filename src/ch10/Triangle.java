package ch10;

public class Triangle extends Shape {
    int height;
    int width;

    @Override
    double area() {
        return (width * height) / 2;
    }
}
