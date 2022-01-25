package 알고리즘;


import java.util.Scanner;

public class LetterDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();

        String letter = scanner.nextLine();
        char alpabet = letter.charAt(0);

        int[] datas = new int[wordArray.length];
        int letterDistance = 1000;
        for (int i = 0; i <wordArray.length; i++ ) {

            if (alpabet == wordArray[i]) {
                letterDistance = 0;
                datas[i] = letterDistance;
            } else {
                letterDistance += 1;
                datas[i] =  letterDistance;
            }
        }

        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(wordArray[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < datas.length; i++) {
            System.out.print(datas[i] + " ");
        }
        System.out.println();

        int reverseDistance = 1;
        for (int i = wordArray.length - 1; i <= 0; i--) {

            if (alpabet == wordArray[i]) {
                reverseDistance = 0;
                datas[i] = reverseDistance;
            } else {
                int before = datas[i];
                if (before > reverseDistance) {
                    datas[i] = reverseDistance;
                }
                reverseDistance += 1;
            }
        }



        for (int i = 0; i < datas.length; i++) {
            System.out.print(datas[i] + " ");
        }













    }
}
