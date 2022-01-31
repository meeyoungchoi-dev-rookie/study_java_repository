package ch12;

import java.util.Scanner;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("10을 x로 나누려 한다");
            String input = scanner.next();
            int inputNum = Integer.parseInt(input);

            int result = 10 / inputNum;
            System.out.printf("10 나누기 %d => %d", inputNum , result);

        } catch (NumberFormatException ex) {
            System.out.printf("정수 변환에 실패");
        } catch (ArithmeticException e ) {
            System.out.println("0으로 나눌수 없다");
        }
        System.out.println("프로그램이 종료된다");


    }
}
