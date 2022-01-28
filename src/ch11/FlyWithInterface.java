package ch11;

public class FlyWithInterface {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Helicopter helicopter = new Helicopter();
        Rocket rocket = new Rocket();

        Flyable[] flyables = {bird , helicopter , rocket};

        for (Flyable data : flyables) {
            data.fly();
        }
    }
}
