package ch04;

public class OddOrEven {
    public static void main(String[] args) {
        printResult(13);
        printResult(6);
    }

    public static void printResult(int n) {
        String result = (n % 2 == 0) ? "짝수" : "홀수";
        System.out.println("정수 " + n + "은" + result + "입니다.");
    }



}
