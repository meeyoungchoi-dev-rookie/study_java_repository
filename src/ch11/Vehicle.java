package ch11;

public interface Vehicle {

    void horn();

    default public void move(String from , String to) {
        System.out.println(from + "에서 " + to + "로 이동한다");
    }


}
