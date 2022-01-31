package ch12;

public class ThrowsTest {
    public static void main(String[] args) {

        try {
            aaa();
        } catch (MyException ex) {
            ex.printStackTrace();
        }




    }

    private static void aaa() throws MyException {
        System.out.println("aaa 메서드가 호출되었다");
        bbb();
    }

    private  static void bbb() throws MyException {
        System.out.println("bbb 메서드가 호출되었다");
        throw new MyException("bbb메서드에서 예외 발생");
    }


}
