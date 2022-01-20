package ch04;

public class GradeSwitch {
    public static void main(String[] args) {
        int score = 95;

        String grade = "";
        switch (score) {

            case  95 :
                grade = "A";
                break;
            case 90 :
                grade = "B";
                break;

        }

        System.out.println(score + "점 , " + grade + "학점");
    }
}
