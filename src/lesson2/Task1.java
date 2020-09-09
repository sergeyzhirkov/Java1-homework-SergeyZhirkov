package lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(array));
        invertArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void invertArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                inputArray[i] = 1;
            } else {
                inputArray[i] = 0;
            }
        }
    }
}
