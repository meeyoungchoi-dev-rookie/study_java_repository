package genericex2;

public class GenericTest {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Apple());
        grapeBox.add(new Grape());
        appleBox.add(new Apple());
    }
}
