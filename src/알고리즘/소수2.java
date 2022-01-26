package 알고리즘;

import java.util.Scanner;

public class 소수2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = 0;
        int[] check = new int[n + 1];


        for (int i = 2; i <= n; i++) {
            if (check[i] == 0) {
                answer += 1;
                for (int j = i; j<= n; j = j + i) {
                    if (check[j] % i == 0) {
                        check[j] = 1;
                    }
                }
            }
        }

        System.out.println("2부터 " + n + "까지 숫자중 소수 개수: " + answer);







    }
}
