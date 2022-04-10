package enumpractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumCategoryTest {
    public static void main(String[] args) {

        Category[] categories = Category.values();

        for (Category c : categories) {
            if (c.getP() == Category.CATEGORY2) {
                System.out.println(c);
                System.out.println(c.toString());
            }
        }

        for (Category c : categories) {
            if (c.getP() == Category.CATEGORY1) {
                System.out.println(c);
                System.out.println(c.toString());
            }
        }
    }
}
