package 알고리즘_복습.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수뒤집기 {
    public static void main(String[] args) {

        소수뒤집기 s = new 소수뒤집기();
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb;
        int indexCount = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[indexCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
            sb = new StringBuffer(arr[i]);
            arr[i] = sb.reverse().toString();

        }

        for (String str : arr) {
            System.out.print(str + " ");
        }


        ArrayList<Integer> result = s.findDecimalNum(arr);
        System.out.println();
        for (Integer data : result) {
            System.out.print(data + " ");
        }


    }

    public ArrayList<Integer> findDecimalNum(String[] array) {
        ArrayList<Integer> decimalList = new ArrayList<>();
       int decimalCount = 0;
        for (int i = 0; i< array.length; i++) {
            if (Integer.parseInt(array[i]) != 1) {
                for (int j = 2; j < Integer.parseInt(array[i]); j++) {
                    if (Integer.parseInt(array[i]) % j == 0) {
                        decimalCount += 1;
                    }
                }

                if (decimalCount < 1) {
                    decimalList.add(Integer.parseInt(array[i]));
                }

                decimalCount = 0;
            }
        }

        return decimalList;
    }
}
