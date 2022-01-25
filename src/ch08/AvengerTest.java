package ch08;

public class AvengerTest {
    public static void main(String[] args) {

        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
        thor.punch(thanos);
        thanos.punch(thor);
        thanos.punch(thor);

        System.out.println(thor.toString());
        System.out.println(thanos.toString());
    }
}
