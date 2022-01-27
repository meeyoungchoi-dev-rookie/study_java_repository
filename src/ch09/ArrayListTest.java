package ch09;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Kim");
        names.add("Lee");
        names.add("Park");
        names.add("Choi");

        names.set(0, "Han");
        names.remove(1);

        for (int i = 0; i < names.size(); i++) {
            System.out.println("인덱스: " + i + " , data: " + names.get(i));
        }



    }
}
