package ch13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankAccountTest {
    public static void main(String[] args) throws IOException {

        BankAccount a = new BankAccount("빌 게이츠", "206-00001", 1000000);
        BankAccount b = new BankAccount("워런 버핏", "206-00002", 1000000);

        File file = new File("accounts-data.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");
        fw.close();

    }
}
