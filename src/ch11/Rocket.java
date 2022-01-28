package ch11;

public class Rocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("로켓이 불꽃을 뿜으며 날아갑니다.");
    }
}
