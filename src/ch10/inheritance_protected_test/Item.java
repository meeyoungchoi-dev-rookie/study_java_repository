package ch10.inheritance_protected_test;

abstract class Item {
    protected String name;
    protected int price;

    Item(String name , int price) {
        this.name = name;
        this.price = price;
    }

    Item() {
        this("이름 없음", -1);
    }



}
