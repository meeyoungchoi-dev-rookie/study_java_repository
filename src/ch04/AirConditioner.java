package ch04;

public class AirConditioner {
    public static void main(String[] args) {

        turnOn(30);
        turnOn(19);




    }

    public static void turnOn(int temperature) {
        if (temperature > 25) {
            System.out.println("현재 온도 " + temperature + "도 , 에어컨을 가동합니다.");
        }
    }
}
