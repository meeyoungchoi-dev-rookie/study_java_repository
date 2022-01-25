package ch03;

public class Cube {
    public static void main(String[] args) {
        int r = 3;
        int result = volume(r);
        System.out.println("한 변의 길이가 " + r + "인 정육면체의 부피: " + result);

    }


    public static  int volume(int r) {
        return r * r * r;
    }
}
