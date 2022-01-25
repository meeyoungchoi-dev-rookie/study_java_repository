package 알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();

        int[] heights = new int[people];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextInt();
        }


        for (int data : heights) {
            System.out.println(data);
        }

        int showCount = 0;

        int max = heights[0];

        for (int i = 1; i <= heights.length - 1; i++) {
            if (i - 1 == 0) {
                showCount += 1;
            }

            if  (heights[i] > max ) {
                max = heights[i];
                showCount += 1;
            } else if (heights[i] <= max) {
                continue;
            }
        }

        System.out.println("선생님이 볼 수 있는 최대 학생수: " + showCount);


    }
}
