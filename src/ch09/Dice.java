package ch09;

import java.util.Random;

public class Dice {

    private  int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {

        Random random = new Random();
        int result = random.nextInt(sides) + 1;

        return result;
    }

}
