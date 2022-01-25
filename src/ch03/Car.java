package ch03;

public class Car {
    public static void main(String[] args) {

        double l = 8.86;
        double km = 182.73;
        double resultKm = calculate(l , km);
        System.out.println("자동자 연비: " + String.format("%.2f" , resultKm) + "km/l");



    }

    public static double calculate(double l , double km) {
        return km / l;
    }



}
