package hashmap;


import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId" , "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("id와 비밀번호를 입력하세요.");
            String id = scan.nextLine().trim();

            System.out.println("password: ");
            String password = scan.nextLine().trim();
            System.out.println();


            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
