package ch09;

public class SumOfDice {
    // 주사위를 두번 던저 나온 눈의 합을 저장할 배열
    static int[] diceSum = new int[14];
    public static void main(String[] args) {

        Dice dice = new Dice(6);
        Dice dice2 = new Dice(6);

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            int num1 = dice.roll();
            int num2 = dice2.roll();

            sum = num1 + num2;
            int sumIndex = SumOfDice.findIndex(sum);
            SumOfDice.diceSum[sumIndex] += 1;
        }

        SumOfDice.printResult();

    }


    public static  int findIndex(int sum) {
        int index = 0;
        for (int j = 0; j < SumOfDice.diceSum.length; j++) {
            if (sum == j) {
                index = j;
            }
        }

        return index;
    }


    public static  void printResult() {
        for (int i = 2; i < 13; i++) {

            System.out.print(i +": ");

            for (int j = 0; j < SumOfDice.diceSum[i]; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();

        }
    }
}
