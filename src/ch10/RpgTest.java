package ch10;

public class RpgTest {
    public static void main(String[] args) {

        Wizard wizard = new Wizard();
        wizard.name = "간달프";
        wizard.hp = 100;
        wizard.mp = 80;
        wizard.speed = 2;
        wizard.punch();
        wizard.fireball();
        wizard.move();

        Knight knight = new Knight();
        knight.name = "킹아서";
        knight.hp = 150;
        knight.stamina = 70;
        knight.speed = 3;
        knight.punch();
        knight.slash();
        knight.move();
        
    }
}
