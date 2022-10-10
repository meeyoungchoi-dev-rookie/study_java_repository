package 상속.abstractEx;

public class AbstractMain {
    public static void main(String[] args) {
        Unit[] group = {new Marine() ,  new Tank(), new DropShip()}; // 상속관계 - 다형성

        for (Unit member : group) {
            member.move(100, 200);
        }
    }
}
