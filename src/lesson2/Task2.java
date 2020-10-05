package lesson2;

import java.util.Arrays;

public class Task2 {
    public static final int ARRAY_SIZE = 8;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        fillArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int[] inputArray) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            inputArray[i] = i * 3;
        }
    }
}
