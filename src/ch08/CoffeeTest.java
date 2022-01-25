package ch08;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee c = new Coffee("아메리카노", 3000);
        c.setPrice(c.getPrice() + 500);
        System.out.println(c.toString());

    }
}
