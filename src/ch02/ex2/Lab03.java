package ch02.ex2;

public class Lab03 {
    public static void main(String[] args) {

        double a = -9.81;
        double t = 5;
        int v0 = 0;
        int x0 = 1000;
        double xt;

        xt = (a*t*t)/0.5 + v0*t + x0;
        System.out.printf("자유낙하 물체의 %.2f초 후 위치는 %.2fm입니다." , t , xt);




    }
}
