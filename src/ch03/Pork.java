package ch03;

public class Pork {
    public static void main(String[] args) {

        int oneKg = 180;
        double kal = 5.179;
        int n = 3;

        double result = calculate(n , oneKg , kal);
        System.out.println("삼겹살 " + n + "인분의 칼로리: " + String.format("%.1f" , result) + " kcal");

    }

    public static double calculate(int n , int kg , double kal) {
        return (double) n * kg * kal;
    }
}
