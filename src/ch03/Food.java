package ch03;

public class Food {
    public static void main(String[] args) {
        pick2();
        pick3();
        pick1();
        pay();
    }

    public static  void pick1() {
        System.out.println("순대를 고른다.");
    }
    
    public static void pick2() {
        System.out.println("떡뽂이를 고른다.");
    }

    public static void pick3() {
        System.out.println("튀김을 고른다.");
    }
    
    public static  void pay() {
        System.out.println("계산한다");
    }
}
