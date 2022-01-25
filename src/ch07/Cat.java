package ch07;

public class Cat {
    
    String name;
    String breeds;
    double weight;
    
    void claw() {
        System.out.println("할퀴기");
    }


    void meow() {
        System.out.println("야옹~");
    }


    public static void main(String[] args) {

        Cat c = new Cat();

        c.name = "네로";
        c.breeds = "패르시안";
        c.weight = 4.37;

        System.out.println("이름: " + c.name);
        System.out.println("품종: " + c.breeds);
        System.out.println("체중: " + c.weight);
    }

}
