package ch10.inheritance_protected_test;

public class Weapon extends Item {

    protected int power;

    public Weapon(String name, int price, int power) {
        super(name , price);
        this.power = power;
    }

    public Weapon() {
        super();
        this.power -= 1;
    }

    public void printInfo() {
        System.out.println(super.name + " , 가격: " + super.price + "골드, 공격력: " + this.power);
    }


}
