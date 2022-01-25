package ch08;

import java.util.ArrayList;
import java.util.List;

public class WebtoonTest {
    public static void main(String[] args) {

        List<Webtoon> webtoonList = new ArrayList<>();
        
        webtoonList.add(new Webtoon("나 혼자만 레벨업업" , "판타지" , "추공님"));
        webtoonList.add(new Webtoon("스위트 집" , "스릴러" , "칸비님"));
        webtoonList.add(new Webtoon("이태원 클래식" , "드라마" , "광진님"));

        for (Webtoon webtoon : webtoonList) {
            System.out.println(webtoon.toString());
        }

        System.out.println("웹툰 총 개수: " + Webtoon.webtoonCount);

    }
}
