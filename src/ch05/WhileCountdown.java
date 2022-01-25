package ch05;

public class WhileCountdown {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int num) {
        System.out.println("카운트다운을 시작합니다.");

        int n = 5;
        while (n >= 0) {

            System.out.println(n + "..");
            n--;
        }
        System.out.println("발사");

    }
}
