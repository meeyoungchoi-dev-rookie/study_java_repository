package ch03;

public class Cylinder {
    public static void main(String[] args) {

        double r = 7;
        double h = 5;
        double result = volume(r , h);
        System.out.println("반지름이 " + r +  " 높이가 " + h + "인 원기둥의 부피: " + String.format("%.1f" , result));


    }

    public static double volume(double r , double h) {
        return  Math.PI * r * r * h;
    }
}
