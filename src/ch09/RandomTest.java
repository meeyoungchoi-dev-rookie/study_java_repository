package ch09;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;

        System.out.println("임의의 정수: " + random.nextInt());

        System.out.println("0이상 " + n + "미만의 임의의 정수: " + random.nextInt(n));

        System.out.println("임의의 실수: " + random.nextDouble());

        System.out.println("임의의 참/거짓: " + random.nextBoolean());
    }
}
