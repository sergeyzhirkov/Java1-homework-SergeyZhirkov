package lesson2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        changeArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 6) {
                inputArray[i] *= 2;
            }
        }
    }
}
