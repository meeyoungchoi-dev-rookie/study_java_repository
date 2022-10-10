package 상속.ExcendsEx1;

public class ExtendsMain {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.setChannel(10);
        smartTv.channelUp();
        System.out.println(smartTv.getChannel());
        smartTv.displayCaption("hello~~");
        smartTv.caption = true;
        smartTv.displayCaption("hello~~");
    }
}
