package ch05;

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i  + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " +  j + " = " + (i * j));
            }
        }
    }
}
