package ch13;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BankAccountReadTest {
    public static void main(String[] args) throws IOException , InterruptedException{

        File file = new File("accounts-data.txt");
        FileReader fr = new FileReader(file);

        int ch;
        while ((ch = fr.read()) != -1) {

            System.out.print((char)ch);

        }

        fr.close();


    }
}
