package ch13;

import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);
    private final  String question;
    private final  int answer;

    public Quiz(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public boolean play() throws QuizException {
        System.out.println(question);
        System.out.println("정답을 입력하세요:");
        String inputStr = scanner.next();
        int inputNum = Integer.parseInt(inputStr);

        if (!(inputNum == 1  || inputNum == 2)) {
            throw new QuizException("보기에 없는 값을 입력하셨습니다.");
        }

        return  (answer == inputNum) ? true : false;


    }



}
