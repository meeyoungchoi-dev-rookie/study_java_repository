package ch10;

public class AnimalTest {
    public static void main(String[] args) {

        Tiger t = new Tiger();
        Lion l = new Lion();
        Dog d = new Dog();
        Cat c = new Cat();

        Animal[] animals = {t , l , d , c};

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
    }
}
