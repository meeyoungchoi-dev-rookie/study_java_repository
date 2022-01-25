package ch07;

public class Square {
    int length;

    int area(int length) {
        return length * length;
    }

    public static void main(String[] args) {

        Square s = new Square();
        s.length = 4;
        int areaSize = s.area(s.length);
        System.out.println("넓이: " + areaSize);

    }
}
