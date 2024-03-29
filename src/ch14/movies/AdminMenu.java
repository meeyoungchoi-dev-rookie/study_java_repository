package ch14.movies;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdminMenu  extends  AbstractMenu {

    private  static final AdminMenu instance = new AdminMenu(null);

    private static final String ADMIN_MENU_TEXT = "1. 영화 등록하기\n" + "2. 영화 목록 보기\n" + "3. 영화 삭제하기\n" + "b. 메인 메뉴로 이동\n" + "q: 종료\n\n"  + "메뉴를 선택하세요: ";

    public AdminMenu(Menu prevMenu) {
        super(ADMIN_MENU_TEXT, prevMenu);
    }

    public static AdminMenu getInstance() {
        return instance;
    }


    @Override
    public Menu next() {
        switch (scanner.nextLine()) {
            case "1":
                createMovie();
                return this;
            case "2":
                printAllMovies();
                return this;
            case "3":
                deleteMovie();
                return this;
            case "b": return prevMenu;
            default: return this;
        }
    }

    private void printAllMovies() {

        try {

            ArrayList<Movie> movies = Movie.findAll();
            System.out.println();
            for (int i = 0; i < movies.size(); i++) {
                System.out.print(movies.get(i).toString());
            }

        } catch (IOException e) {
            System.out.println("데이터 접근에 실패했습니다.");
        }


    }

    private void createMovie() {

        System.out.println("제목: ");
        String title = scanner.nextLine();

        System.out.println("장르: ");
        String genere = scanner.nextLine();

        Movie movie = new Movie(title, genere);
        System.out.println(movie.toString());

        try {

            movie.save();
        } catch (Exception e) {

        }
    }
    
    
    private void deleteMovie() {
        printAllMovies();
        System.out.println("삭제할 영화를 선태갛세요");

        try {
            Movie.delete(scanner.nextLine());

        } catch (Exception e) {

        }

    }
    


}
