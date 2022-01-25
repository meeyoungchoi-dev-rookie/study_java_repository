package 알고리즘;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int[] intarray = new int[] {1, 2, 5, 4, 3};
        int max = intarray[0];

        for (int i = 1; i < intarray.length; i++) {
            if (intarray[i] > max) {
                max = intarray[i];
            }
        }

        System.out.println(max);
        
    }
}
