package ch10;

public class OverridingTest {
    public static void main(String[] args) {

        Archer a = new Archer();
        Archer ma = new MasterArcher();

        Archer[] archers = {a , ma};
        for (Archer data : archers) {
            data.shoot();
        }


    }
}
