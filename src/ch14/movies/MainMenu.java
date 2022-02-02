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
            case "q" : return prevMenu;
            default: return this;
        }
    }
}
