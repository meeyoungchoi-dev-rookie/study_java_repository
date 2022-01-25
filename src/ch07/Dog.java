package ch07;

public class Dog {

    String name;
    String breeds;
    int age;

    void wag() {
        System.out.println(name + " 꼬리를 흔든다");
    }

    void bark() {
        System.out.println(name + " 멍멍");
    }



    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "망고";
        d1.breeds = "골든리트리버";
        d1.age = 2;

        d2.name = "까미";
        d2.breeds = "믹스";
        d2.age = 3;


        System.out.println("d1: " + d1.name + " , " + d1.breeds + " , " + d1.age);
        System.out.println("d2: " + d2.name + " , " + d2.breeds + " , " + d2.age);

    }
}
