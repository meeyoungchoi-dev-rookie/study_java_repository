package ch10;

public class Square extends Shape {
    int length;

    @Override
    double area() {
        return length * length;
    }
}
