package ch08;

public class Avenger {

    String name;
    int hp;

    Avenger(String n , int h) {
        name = n;
        hp = h;
    }

    @Override
    public String toString() {
        return "Avenger{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public void punch(Avenger enemy) {
        System.out.println(name + "의 펀치");
        enemy.hp -= 10;
        System.out.println(enemy.name + "의 체력: " + enemy.hp);
    }
}
