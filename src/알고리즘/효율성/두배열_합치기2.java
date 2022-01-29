package 알고리즘.효율성;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열_합치기2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index1 = scanner.nextInt();

        int[] arr1 = new int[index1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();

        }

        int index2 = scanner.nextInt();

        int[] arr2 = new int[index2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }


        System.out.println();

        ArrayList<Integer> answerArray = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] < arr2[p2]) {
                System.out.println("arr1[p1] " + arr1[p1]);
                answerArray.add(arr1[p1]);
                p1++;
            } else {
               answerArray.add(arr2[p2]);
                System.out.println("arr2[p2] " + arr2[p2]);
                p2++;
            }
        }

        while (p1 < arr1.length) {
            System.out.println("p1 남았을때");
            System.out.print(arr1[p1]);
            answerArray.add(arr1[p1]);
            p1++;
        }

        while (p2 < arr2.length) {
            System.out.println("p2 남았을때");
            System.out.print(arr2[p2]);
            answerArray.add(arr2[p2]);
            p2++;
        }


        for (Integer data : answerArray) {
            System.out.print(data + " ");
        }


    }
}
