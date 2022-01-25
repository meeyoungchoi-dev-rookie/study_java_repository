package ch08;

public class Drink {

    String name;
    int price;


    Drink(String n , int p) {
        name = n;
        price = p;
    }

    Drink() {

    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
