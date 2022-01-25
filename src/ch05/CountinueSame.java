package ch05;

public class CountinueSame {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf(" 짝 ");
                continue;
            }
            System.out.printf(" %d " , i);
        }
    }
}
