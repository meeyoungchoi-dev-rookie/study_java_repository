package 프로그래머스.해시;

import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) {

        String[] phone_numbers = {"119", "97 674 223", "11 9552 4421"};

        전화번호목록 전화 = new 전화번호목록();
        boolean status = 전화.solution(phone_numbers);
        System.out.println("status: " + status);



    }


    public boolean solution(String[] phone_book ) {

        boolean answer = true;

        // 1. 배열을 오름차순 정렬한다
        /*
        * 11 9552 4421
        * 119
        * 97 674 223
        * */
        Arrays.sort(phone_book);


        // 문자열 자체만 비교가 되면 된다
        // 따라서 굳이 split할 필요가 없다
        // 대상 문자열이 특정 문자 또는 문자열로 시작하는 지 체크해주면 된다
        // 따라서 startsWith 함수를 사용해야 한다
        // 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰  true/false를 반환한다
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }



}
