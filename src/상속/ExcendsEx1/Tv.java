package 상속.ExcendsEx1;

public class Tv {
    private boolean power;
    private int channel;

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isPower() {
        return power;
    }

    public int getChannel() {
        return channel;
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
