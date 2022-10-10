package 상속.abstractEx;

public class Marine extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }

    void stimPack() {
        System.out.println("Marine의 스팀팩");
    }
}
