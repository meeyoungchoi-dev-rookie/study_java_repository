package 알고리즘;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수test5 {
    static ArrayList<String> primes = new ArrayList<>();
    public static void main(String[] args) {
        StringBuffer sb;
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        String[] numbers = new String[index];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.next();
        }


        int reverseNumber = 0;
        for (int j = 0; j < numbers.length; j++) {
            String reversedNum = new StringBuffer(numbers[j]).reverse().toString();
            reverseNumber = Integer.parseInt(reversedNum);
            System.out.println("뒤집은수: " + reverseNumber);

            뒤집은소수test5.isPrime(reverseNumber);
        }

        System.out.println("소수: ");
        for (String data : 뒤집은소수test5.primes) {
            System.out.println(data);
        }

    }


    public static boolean isPrime(int reverseNum) {
        boolean primeStatus = false;
        int okPrimeCount = 0;
        for (int i = 2; i <= reverseNum; i++) {
            if (reverseNum % i == 0) {
                okPrimeCount += 1;
            }
        }

        if (okPrimeCount == 1) {
            primes.add(String.valueOf(reverseNum));
            primeStatus = true;
        } else {
            primeStatus = false;
        }
        okPrimeCount = 0;

        return primeStatus;
    }



}
