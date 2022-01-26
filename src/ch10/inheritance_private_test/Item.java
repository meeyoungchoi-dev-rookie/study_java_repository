package ch10.inheritance_private_test;

abstract class Item {
    private String name;
    private int price;

    public Item(String name , int price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
        this("이름 없음", -1);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
