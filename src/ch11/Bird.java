package ch11;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("새가 날개를 퍼덕이며 날아간다");
    }
}
