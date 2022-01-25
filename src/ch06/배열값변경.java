package ch06;

public class 배열값변경 {
    public static void main(String[] args) {

        int[] sales = new int[5];

        sales[0] = 52;
        sales[1] = 50;
        sales[2] = 55;
        sales[3] = 42;
        sales[4] = 38;

        int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
        System.out.println("총 판매량: " + sum);

    }
}
