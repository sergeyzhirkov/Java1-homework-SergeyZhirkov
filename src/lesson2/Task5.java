package lesson2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(array);
        System.out.println("min = " + array[0]);
        System.out.println("max = " + array[array.length - 1]);
    }
}
