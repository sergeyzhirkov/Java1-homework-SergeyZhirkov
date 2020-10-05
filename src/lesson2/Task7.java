package lesson2;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        displaceByNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
        displaceByNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, -2);
        displaceByNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        displaceByNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, -10);

    }

    public static void displaceByNumber(int[] inputArray, int n) {
        System.out.println(Arrays.toString(inputArray));
        int k = n;
        if (Math.abs(n) > inputArray.length) {
            n = n % inputArray.length;
        }
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int lastNumber = inputArray[inputArray.length - 1];
                for (int i = inputArray.length - 1; i > 0; i--) {
                    inputArray[i] = inputArray[i - 1];
                }
                inputArray[0] = lastNumber;
            }
        } else {
            for (int j = 0; j < Math.abs(n); j++) {
                int firstNumber = inputArray[0];
                for (int i = 0; i < inputArray.length - 1; i++) {
                    inputArray[i] = inputArray[i + 1];
                }
                inputArray[inputArray.length - 1] = firstNumber;
            }
        }
        System.out.println(Arrays.toString(inputArray) + " | n = " + k);

    }
}
