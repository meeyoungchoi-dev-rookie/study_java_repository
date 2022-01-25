package 알고리즘;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        단어뒤집기 s = new 단어뒤집기();

        ArrayList<String> words = new ArrayList<>();
        int wordCount = scan.nextInt();

        for (int i = 0; i <= wordCount; i++) {
            String word = scan.nextLine();
            words.add(word);
        }

        for (String str : words) {
            System.out.println(str);
        }

        s.solution(words);





    }

    public ArrayList<String> solution(ArrayList<String> words) {

        ArrayList<String> reverseWords = new ArrayList<>();

        for (String str : words) {
            char[] data = str.toCharArray();
            char[] reverWordsData = new char[data.length];
            int startIndex = 0;
            for (int i =  data.length - 1 ; i >= 0; i--) {
                reverWordsData[startIndex++] =  data[i];

                if (i == 0) {
                    String result = "";
                    for (int j = 0; j < reverWordsData.length; j++) {
                        result += Character.toString(reverWordsData[j]);
                    }
                    reverseWords.add(result);

                }
            }
        }

        for (String reverseData : reverseWords) {
            System.out.println(reverseData);
        }

        return null;
    }


}
