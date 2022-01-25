package 알고리즘;

import java.util.Scanner;

public class NonDuplicate2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        NonDuplicate2 no = new NonDuplicate2();
        no.solution(word);

    }

    public String solution(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            } else {
                continue;
            }
        }

        System.out.println("result: " + result);




        return "";
    }



}
