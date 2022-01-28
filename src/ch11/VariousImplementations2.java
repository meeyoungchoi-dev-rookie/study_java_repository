package ch11;

public class VariousImplementations2 {

    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        Alarm alarm = sp;
        Phone phone = sp;
        Messenger messenger = sp;

        alarm.playMusic("상어송");
        alarm.beep();

        phone.call("010-1243-5678");
        phone.receive();

        messenger.sendMsg("010-1243-5678", "같이 코딩 하자~!!");
        messenger.receiveMsg();

    }


}
