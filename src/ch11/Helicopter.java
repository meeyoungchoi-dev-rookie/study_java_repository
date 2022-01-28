package ch11;

public class Helicopter implements Flyable{
    @Override
    public void fly() {
        System.out.println("헬기가 프로팰러를 돌리며 날아갑니다.");
    }
}
