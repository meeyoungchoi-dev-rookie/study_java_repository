package ch06;

public class TopScoreStudent {
    public static void main(String[] args) {

        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Sam"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};


        int lowes = 0;
        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {

            for (int j = 0; j < i; j++) {
                if (scores[j] > scores[i]) {
                    max = scores[j];
                    maxIndex = j;
                }
            }
        }

        System.out.println("1등: " + names[maxIndex] + "(" + scores[maxIndex] + "점)");











    }
}
