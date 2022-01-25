package ch08;

public class Hearo {

    String name;
    int power;
    int speed;

    Hearo(String n, int p , int s) {
        name = n;
        power = p;
        speed = s;
    }

    @Override
    public String toString() {
        return "Hearo{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
}
