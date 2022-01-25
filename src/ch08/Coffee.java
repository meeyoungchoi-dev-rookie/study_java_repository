package ch08;

public class Coffee {

    private String name;
    private int price;

    Coffee(String _name , int _price) {
        name = _name;
        price = _price;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }


    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
