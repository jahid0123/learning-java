package loopPractice;

public class MinMax {
    public static void main(String[] args) {
       /* int[] array = {5, 6, 9, 7, 3, 8, 12, 19, 29};
        int min = array[0];
        int max = array[0];

        for (int k : array) {
            if (k < min) {
                min = k;
            }
        }
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(min);
        System.out.println(max);*/

        try {
            int[] num = {2, 3, 5, 77, 99, 66, 111, 8, 2};
            int min = num[0];
            int max = num[0];

            for (int i : num) {
                if (min < i) {
                    min = i;
                }
                if (max>i) {
                    max = i;
                }

            }
            System.out.println(min);
            System.out.println(max);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
