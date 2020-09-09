package lesson2;

public class Task6 {
    public static void main(String[] args) {
        checkBalance(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        checkBalance(new int[]{1, 1, 1, 2, 1});
    }

    public static void checkBalance(int[] inputArray) {
        int amount = 0;
        for (int i : inputArray) {
            amount += i;
        }
        boolean check = false;
        int sum = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            sum += inputArray[i];
            if (sum == amount - sum) {
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}
