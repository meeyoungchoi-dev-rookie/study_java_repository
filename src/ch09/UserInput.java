package ch09;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.next();

        System.out.println("학번: ");
        int number = scanner.nextInt();

        System.out.println("학점: ");
        double grade = scanner.nextDouble();


        System.out.println("이름: " + name + " , 학번: " + number + " , 학점: " + grade);
    }


}
