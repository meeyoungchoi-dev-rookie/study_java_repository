package ch10;

public class Item {
    String name;
    int price;

    Item(String name , int price) {
        this.name = name;
        this.price = price;
    }

    Item() {
        this("이름 없음", -1);
    }
}
