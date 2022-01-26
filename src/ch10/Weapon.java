package ch10;

public class Weapon extends Item {

    int power;

    Weapon() {
        super();
        this.power -= 1;
    }

    Weapon(String name , int price , int power) {
        super(name , price);
        this.power = power;
    }

    void printInfo() {
        System.out.println(super.name + " , 가격: " + super.price + "골드 " +  " 공격력: " + this.power);
    }


}
