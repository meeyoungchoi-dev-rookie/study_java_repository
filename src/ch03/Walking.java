package ch03;

public class Walking {
    public static void main(String[] args) {
        int n = 5000;
        double kCal = 0.02;
        double outPutCal = calculate(n , kCal);
        System.out.println(n + "번 걸었을 시의 소모 칼로리는 " + String.format("%.1f" , outPutCal) + " kCal 입니다.");
    }

    public static  double calculate(int n , double kCal) {
        return n * kCal;
    }



}
