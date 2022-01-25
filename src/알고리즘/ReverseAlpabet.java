package 알고리즘;

import java.util.Scanner;

public class ReverseAlpabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("word: " + word);


        ReverseAlpabet rw = new ReverseAlpabet();
        rw.solution(word);





    }


    public void solution(String str) {

        char[] wordArray = str.toCharArray();


        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {

            if (!Character.isAlphabetic(wordArray[rt])) {
                rt--;

            } else
            if (!Character.isAlphabetic(wordArray[lt])) {
                lt++;
            } else {
                char temp = wordArray[lt];
                wordArray[lt] = wordArray[rt];
                wordArray[rt] = temp;

                lt++;
                rt--;

            }




        }



        String temp = String.valueOf(wordArray);
            System.out.println("temp: " + temp);

    }

}
