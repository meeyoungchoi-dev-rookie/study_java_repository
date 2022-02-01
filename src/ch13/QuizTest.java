package ch13;

public class QuizTest {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz("다음 중 과일이 아닌 것은? 1:사과 2:젤리" , 2);
        String result = "퀴즈가 정상 수행되지 않았습니다.";

        try {
            result = myQuiz.play() ? "정답입니다." : "오답입니다";
        } catch (QuizException ex) {

            System.out.println("예외 발생" + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("예외 발생" +  ex.getMessage());
        } finally {
            System.out.println(result);
        }




    }
}
