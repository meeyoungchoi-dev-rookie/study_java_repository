package 알고리즘;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println("word: " + word);

        char[] wordArray = word.toCharArray();

        String result = "";

        int sameCount = 0;
        for (int i = 1; i < wordArray.length; i++) {


            for (int k =  0; k < i ; k++) {
                if (wordArray[i] == wordArray[k]) {
                    sameCount += 1;
                }
            }


                result += wordArray[i];
                result +=  String.valueOf(sameCount);
        }





    }
}
