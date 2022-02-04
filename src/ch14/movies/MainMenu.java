package ch14.movies;

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




}
