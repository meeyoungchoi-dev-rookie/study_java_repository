package ch10;

public class Car {
    String name;

    Car (String _name) {
        name = _name;
        System.out.println("모델명: " + name);
    }

    void move() {
        System.out.println(name + "가 이동합니다.");
    }
}
