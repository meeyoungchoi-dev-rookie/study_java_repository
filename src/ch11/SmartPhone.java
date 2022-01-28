package ch11;

public class SmartPhone implements Alarm , Phone , Messenger {
    private String phoneNumber;

    @Override
    public void playMusic(String title) {
        System.out.println(title + "음악을 재생한다");
    }

    @Override
    public void beep() {
        System.out.println("삐삐~!! 알람이 울린다");
    }

    @Override
    public void call(String phoneNum) {
        System.out.println(phoneNum + "번으로 전화를 건다");
    }

    @Override
    public void receive() {
        System.out.println("메시지가 도착했습니다.");
    }


    @Override
    public void sendMsg(String phoneNum, String msg) {
        System.out.println(phoneNum + "번호르 " + msg + " 내용의 메시지를 보냈습니다.");
    }

    @Override
    public void receiveMsg() {
        System.out.println("메시지가 도착 하였습니다.");
    }
}
