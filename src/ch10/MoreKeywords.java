package ch10;

public class MoreKeywords {
    public static void main(String[] args) {
        Item item1 = new Item("마법사의 지팡이", 1000);
        System.out.println(item1.name + " , " + item1.price);

        Item item2 = new Item();
        System.out.println(item2.name + " , " + item2.price);


        Weapon w1 = new Weapon("장검", 1200 , 10);
        w1.printInfo();

        Weapon w2 = new Weapon();
        w2.printInfo();
    }
}
