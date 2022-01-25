package 알고리즘;

import java.util.Scanner;

public class NonDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        NonDuplicate no = new NonDuplicate();
        no.solution(word);

    }

    public String solution(String str) {
        String result = "";
        int size = str.length();
        char[] strArray = str.toCharArray();

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (strArray[i] == strArray[j]) {
                    strArray[i] = '\0';
                }
            }
        }


        result = String.valueOf(strArray);
        System.out.println("result: " + result);






        return "";
    }



}
