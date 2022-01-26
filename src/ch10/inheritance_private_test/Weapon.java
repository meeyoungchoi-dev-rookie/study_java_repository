package ch10.inheritance_private_test;

public class Weapon extends  Item {

    private int power;

    public Weapon(String name, int price, int power) {
        super(name , price);
        this.power = power;
    }

    public Weapon() {
        super();
        this.power -= 1;
    }

    public void printInfo() {
        System.out.println(super.getName() + " , 가격: " + super.getPrice() + "골드, 공격력: " + this.power);
    }


}
