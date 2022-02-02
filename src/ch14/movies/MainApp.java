package ch14.movies;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다.");
         Menu menu = MainMenu.getInstance();
        System.out.println(menu.toString());

         while (menu != null) {
            menu.print();
            menu = menu.next();
         }

        System.out.println("프로그램이 종료된다");

    }
}
