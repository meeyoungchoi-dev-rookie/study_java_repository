package 알고리즘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("input: " + input);

        //1. 전부 대문자로 변환
        String inputUpper = input.toUpperCase();

        char[] inputUpperArray = inputUpper.toCharArray();
        System.out.println("대문자로 변환: " + inputUpper);

        // 기존 문자열에서 하나씩 꺼낸다
        // 대문자로 변환한 문자열에서 하나씩 꺼낸다
        // 비교한다 => 같으면 기존 문자를 소문자로 변환
        //        => 다르면 기존 문자를 대문자로 변환




        String result = "";
        char[] inputArray = main.solution(input , inputUpperArray);

        for (int i = 0; i < inputArray.length; i++) {
            result += Character.toString(inputArray[i]);
        }

        System.out.println("result: " + result);






    }



    public char[] solution(String input , char[] inputUpperArray) {


        char[] inputArray = input.toCharArray();

        int i = 0;
        while (i < inputArray.length) {

            if  (inputArray[i] == inputUpperArray[i]) {
                inputArray[i] = Character.toLowerCase(inputArray[i]);
            } else {
                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }

            i++;
        }

        return inputArray;

    }
}
