package 알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongWord_indexof {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LongWord_indexof lw = new LongWord_indexof();


        String sentence = scan.nextLine();
        System.out.println("sentence: " + sentence);
        String result = lw.solution(sentence);
        System.out.println(result);
    }

    public String solution(String sentence) {

        String result = "";

        int m = Integer.MIN_VALUE, pos;
        System.out.println(m);

        System.out.println("pos: " + m);
        while ((pos = sentence.indexOf(' ')) != -1) {// 띄어쓰기가 발견되었을때
            System.out.println("pos: " + pos );
                String tmp = sentence.substring(0 , pos);
            System.out.println("tmp: " + tmp);
                int len  = tmp.length();
                if (len  > m) {
                    m = len;
                    result = tmp;
                }
               sentence  = sentence.substring(pos + 1);
            System.out.println("sentence: " + sentence);
        }

        if (result.length() > m) {
            result = sentence;
            System.out.println("result: " + result);


        }

        return result;
    }



}
