package ch04;

public class TrafficLight {
    public static void main(String[] args) {
        light("RED");
        light("YELLOW");
    }

    public static void light(String color) {
        switch (color) {
            case "RED":
                System.out.println("빨간불이 켜집니다.");
                break;
            case "YELLOW":
                System.out.println("노란불이 켜집니다.");
                break;
            case "GREEN":
                System.out.println("초록불이 켜집니다.");
                break;
            default:
                System.out.println("d에러, 잘못된 색 입력: " + color);
        }
    }



}
