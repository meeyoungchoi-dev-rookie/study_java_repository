package ch11;

public class DefaultMethodTest {
    public static void main(String[] args) {

        Vehicle b = new Bicycle();
        b.horn();
        b.move("명동" , "신촌");

        Vehicle t = new Train();
        t.horn();
        t.move("서울" , "부산");



    }
}
