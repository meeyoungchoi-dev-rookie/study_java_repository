package ch10.inheritance_private_test;

public class MoreKeywords {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검", 1200 , 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();

    }
}
