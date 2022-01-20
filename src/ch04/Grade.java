package ch04;

import sun.java2d.opengl.OGLRenderQueue;

public class Grade {
    public static void main(String[] args) {
            printGrade(96);
            printGrade(86);
            printGrade(70);
            printGrade(55);
    }

    public static void  printGrade(int score) {
        String grade = "";

        if (score >= 90) {
                grade = "A";
        } else if (score  >= 80) {
                grade = "B";
        } else if (score >= 70) {
               grade = "C";
        } else {
            grade = "F";
        }


        System.out.println(score + "점수 , " +  grade + "학점");
    }

}
