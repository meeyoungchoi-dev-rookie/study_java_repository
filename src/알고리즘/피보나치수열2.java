package 알고리즘;

import java.util.Scanner;

public class 피보나치수열2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 배열을 안쓰고 하는 경우
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " " );
        for (int i = 2; i < n; i++ ) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }




    }
}
