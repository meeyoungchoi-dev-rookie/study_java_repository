package ch03;

public class Square {
    public static void main(String[] args) {
        int n = 4;
        int s = square(n);
        System.out.println("한 변의 길이가 " + n + "인 정사각형의 넓이: " + s);
    }

    public static int square(int length) {
        return length * length;
    }



}
