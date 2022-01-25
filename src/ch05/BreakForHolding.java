package ch05;

public class BreakForHolding {
    public static void main(String[] args) {

        int result = printSum(1, 10);
        System.out.println("result: " + result);
    }


    public static int printSum(int start , int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
            sum += i;
        }

        return sum;
    }
}
