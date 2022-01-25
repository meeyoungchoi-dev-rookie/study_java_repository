package 알고리즘;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordReverse {
    public static void main(String[] args) {




    }


    public ArrayList<String> solution(int n , String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {

                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;


            }

            String temp = String.valueOf(s);
            answer.add(temp);

        }
        return answer;




    }

}
