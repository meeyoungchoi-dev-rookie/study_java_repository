package genericex;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Tv> tvs = new ArrayList<>();
        products.add(new Tv());// Tv가 Product를 상속받았기 때문에 다형성 적용
        products.add(new Audio()); // Audio가 Product를 상속받았기 떄문에 다형성 적용
        tvs.add(new Tv());
        tvs.add(new Tv());
        printAll(products);
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}
