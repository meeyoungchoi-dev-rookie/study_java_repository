package ch12;

public class ExceptionEx2 {
    public static void main(String[] args) {

        String[] names = {"Kim", "Lee", "Park", "Choi"};

        try {
            System.out.println("0번 인덱스 요소: " + names[0]);
            System.out.println("1번 인덱스 요소: " + names[1]);
            System.out.println("2번 인덱스 요소: " + names[2]);
            System.out.println("3번 인덱스 요소: " + names[3]);
            System.out.println("4번 인덱스 요소: " + names[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("인덱스 접근이 잘못되었습니다.");
        } finally {
            System.out.println("finally 문은 예외 발생과 관계없이 항상 수행된다");
        }
        System.out.println("프로그램이 종료된다");



    }
}
