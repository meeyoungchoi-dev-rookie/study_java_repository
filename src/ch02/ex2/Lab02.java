package ch02.ex2;

public class Lab02 {
    public static void main(String[] args) {
            int num = 374;
            int unitsSum = 0;

            int units = num % 10;
            int tens = num / 10 % 10;
            int hundreds = num / 100;

            unitsSum = units + tens + hundreds;


            System.out.printf("정수 %d의 각 자리 숫자의 총합: %d" , num , unitsSum);




    }
}
