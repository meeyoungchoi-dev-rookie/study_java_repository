package 프로그래머스.해시;

import java.util.Arrays;

public class split_test {
    public static void main(String[] args) {

        String[] array = {"111", "12 345 456" , "3456 6666"};

        for (int i = 0; i < array.length; i++) {
            String[] afterSplit = array[i].split("");
            for (int j = 0; j < afterSplit.length; i++) {
                System.out.println(afterSplit[j]);
            }
        }





    }
}
