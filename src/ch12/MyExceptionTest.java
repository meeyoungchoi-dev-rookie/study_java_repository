package ch12;

public class MyExceptionTest {
    public static void main(String[] args) {

        try {

            throw new MyException("예외 발생시키기");

        } catch (MyException ex) {
            System.out.println("예외 메세지: " + ex.getMessage());
        }





    }
}
