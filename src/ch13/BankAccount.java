package ch13;

public class BankAccount {

    private  final String username;
    private final  String number;
    private  int amout;

    public BankAccount(String username, String number, int amout) {
        this.username = username;
        this.number = number;
        this.amout = amout;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "username='" + username + '\'' +
                ", number='" + number + '\'' +
                ", amout=" + amout +
                '}';
    }
}
