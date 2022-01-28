package ch11;

public class Train  implements Vehicle{


    @Override
    public void horn() {
        System.out.println("뿌우~~~뿌우~~~");
    }

    @Override
    public void move(String from, String to) {
        System.out.println("지하철이 " + from + "역 에서 " + to + "역으로 이동한다");
    }
}
