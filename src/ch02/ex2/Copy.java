package ch02.ex2;

public class Copy {
    public static void main(String[] args) {

        String origin = "가나다라";

        String copy = origin;
        copy += "마바사";

        System.out.println("origin 변수: " + origin);
        System.out.println("변수 복사후 문자열 연결: " + copy);



    }
}
