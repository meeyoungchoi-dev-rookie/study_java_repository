package ch04;

public class LeapYear {
    public static void main(String[] args) {

        calLeapYear(2020);
        calLeapYear(1900);
        calLeapYear(2000);



    }

    public static void calLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0) {
                System.out.println(year + "평년");
            } else {
                System.out.println(year + "윤년");
            }
        }


    }
}
