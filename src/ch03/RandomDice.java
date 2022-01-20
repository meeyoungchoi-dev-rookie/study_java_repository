package ch03;

public class RandomDice {
    public static void main(String[] args) {

        int diceNum = rollDice();
        System.out.println("주사위의 눈: " + diceNum);



    }

    public static int rollDice() {
        double result = Math.random() * 6;
        return (int)result + 1;
    }
}
