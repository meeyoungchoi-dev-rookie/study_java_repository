package ch14.movies;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainMenu extends AbstractMenu {
    private  static final MainMenu instance = new MainMenu(null);

    private static final String MAIN_MENU_TEXT = "1. 영화 얘매하기\n" + "2. 얘매 확인하기\n" + "3. 얘매 취소하기\n" + "4. 관리자 메뉴로 이동\n" + "q: 종료\n\n"  + "메뉴를 선택하세요: ";

    private MainMenu(Menu prevMenu) {
        super(MAIN_MENU_TEXT, prevMenu);
    }

    public static MainMenu getInstance() {
        return instance;
    }


    @Override
    public Menu next() {

        switch (scanner.nextLine()) {
            case "1":
                reserve();
                return this;
            case "2":
                checkReservation();
                return this;

            case "3":
                cancelReservation();
                return this;

            case "4" :
                if (! checkedAdminPassword()) {
                    System.out.println("비밀번호가 틀렸습니다.");
                    return this; // 실패한 경우 메인 메뉴 객체 반환
                }
                AdminMenu adminMenu = AdminMenu.getInstance();
                adminMenu.setPrevMenu(this);
                return adminMenu;

            case "q" : return prevMenu;
            default: return this;
        }
    }

    private boolean checkedAdminPassword() {
        System.out.println("관리자 비밀번호를 입력하세요.");
        return "admin1234".equals(scanner.nextLine());
    }

    private  void checkReservation() {
        System.out.print("발급번호를 입력하세요: ");


        try {
           Reservation r =  Reservation.findById(scanner.nextLine());

           if (r != null) {
               System.out.println("[확인완료]" + r.toString());
           } else {
               System.out.println("얘매 내역이 없습니다.");
           }

        } catch (IOException e) {
            System.out.println("파일 입출력에 문제가 생겼습니다.");
        }
    }


    private  void cancelReservation() {
        System.out.println("발급번호를 입력하세요: ");

        try {
            Reservation cancled =  Reservation.findById(scanner.nextLine());

            if (cancled != null) {
                System.out.println("[확인완료]" + cancled.toString());
            } else {
                System.out.println("얘매 내역이 없습니다.");
            }

        } catch (IOException e) {
            System.out.println("파일 입출력에 문제가 생겼습니다.");
        }
    }


    public void reserve() {

        try {
            ArrayList<Movie> movies = Movie.findAll();

            for (int i = 0; i < movies.size(); i++) {
                System.out.println(movies.get(i).toString());
            }

            System.out.println("얘매할 영화를 입력하세요");
            String movieIdStr = scanner.nextLine();

            Movie m = Movie.findById(movieIdStr);
            ArrayList<Reservation> reservations = Reservation.findByIdMovie(movieIdStr);
            Seats seats = new Seats(reservations);
            seats.show();

            System.out.print("좌석을 선택하세요 예)E-9");
            String seatName = scanner.nextLine();
            seats.mark(seatName);

            Reservation r = new Reservation(Long.parseLong(movieIdStr), m.getTitle(), seatName);
            r.save();

            System.out.println("얘매가 완료 되었습니다.");
            System.out.println("발급번호: " + r.getId());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
