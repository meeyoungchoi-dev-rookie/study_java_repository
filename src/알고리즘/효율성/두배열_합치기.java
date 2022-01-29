package 알고리즘.효율성;

import java.util.Scanner;

public class 두배열_합치기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index1 = scanner.nextInt();

        int[] arr1 = new int[index1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();

        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();


        int index2 = scanner.nextInt();

        int[] arr2 = new int[index2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = new int[index1 + index2];
        System.out.println("arr3.length: " + arr3.length);


        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            k += 1;

        }

        for (int j = 0; j < arr2.length; j++ ) {
            arr3[k] = arr2[j];
            k += 1;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        int min = 0;
        for (int i = 1; i <= arr3.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr3[i] < arr3[j]) {
                    min = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = min;
                }
            }
        }

        System.out.println("arr3 배열의 요소 오름차순으로 정렬후");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }



    }
}
