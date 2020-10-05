package lesson2;

public class Task4 {
    public static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];
        printArray(array);
        fillDiagonal(array);
        System.out.println();
        printArray(array);
    }

    public static void fillDiagonal(int[][] inputArray) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            inputArray[i][i] = 1;
            inputArray[i][ARRAY_SIZE - i -1] = 1;
        }
    }

    public static void printArray(int[][] inputArray){
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                System.out.printf("%d ",inputArray[i][j]);
            }
            System.out.println();
        }
    }
}
