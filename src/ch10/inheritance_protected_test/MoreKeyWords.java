package ch10.inheritance_protected_test;

public class MoreKeyWords {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검", 1200 , 10);
        w1.printInfo();

        Weapon w2 = new Weapon();
        w2.printInfo();



    }
}
