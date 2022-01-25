package ch05;

public class StarTree {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" * ");
            }
            System.out.println();
        }
    }
}
