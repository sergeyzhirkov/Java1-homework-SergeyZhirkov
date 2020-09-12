package lesson3;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        startGame();
    }

    public static boolean endGame = false;

    public static void startGame() {
        String word = selectedWord();
        while (!endGame){
            playGame(word);
        }
    }

    public static void playGame(String compWord) {
        String userWord = inputWord();
        String protectString = "###############";
        if (compWord.equals(userWord)) {
            System.out.println("Поздравляем, вы угадали слово!\n Это - " + compWord);
            endGame = true;
        } else {
            System.out.println("Вы не угадали слово :( , подсказка совпадающих букв:");
            for (int i = 0; i < protectString.length(); i++) {
                if ((i < compWord.length()) && (i < userWord.length()) && (compWord.charAt(i) == userWord.charAt(i))) {
                    System.out.print(compWord.charAt(i));
                } else {
                    System.out.print(protectString.charAt(i));
                }
            }
        }
        System.out.println();
    }

    public static String selectedWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        return words[(int) (Math.random() * words.length)];
    }

    public static Scanner sc = new Scanner(System.in);

    public static String inputWord() {
        System.out.println("Введите слово маленькими буквами:");
        return sc.nextLine();
    }
}
