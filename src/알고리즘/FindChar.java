package 알고리즘;


import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        char input2 = in.next().charAt(0);
        System.out.println("input1: " + input1);
        System.out.println("input2: " + input2);




        int okCount = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == input2 ) {

            }

        }
        System.out.println(okCount);


    }
}
