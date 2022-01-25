package ch06;

public class 변수와배열 {
    public static void main(String[] args) {

        System.out.println("================== 배열 사용 전 ==============================");
        int a = 88;
        int b = 98;
        int c = 68;
        int d = 72;
        int e = 47;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        System.out.println("=========================== 배열 사용 후 ============================");

        int[] scores = {88, 98, 68, 72, 47};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }


    }
}
