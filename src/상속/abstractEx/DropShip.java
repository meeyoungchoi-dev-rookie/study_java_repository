package 상속.abstractEx;

public class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }

    void load() {}
    void unload() {}
}
