package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE = 7;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = 'O';

    public static final String EMPTY = " ";
    public static final String EMPTY_FIRST = "  ";


    public static final char[][] map = new char[SIZE][SIZE];
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    public static void main(String[] args) {
        turnGame();

    }

    private static void turnGame() {
        initMap();

        printMap();

        playGame();
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void printMapHeader() {
        System.out.print(EMPTY_FIRST);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                System.exit(0);
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                System.exit(0);
            }
        }
    }

    private static void humanTurn() {
        int rowNumber;
        int columnNumber;
        do {
            System.out.println("Ход человека введите номер строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Столбец = ");
            columnNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, columnNumber, false));
        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;

    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            String winMessage;
            if (symbol == DOT_HUMAN) {
                winMessage = "You are Win! :)";
            } else {
                winMessage = "AI win :(";
            }
            System.out.println(winMessage);
            return true;
        }

        if (isMapFull()) {
            return true;
        }

        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        return checkRow(symbol) || checkColumn(symbol) || checkDyagonal(symbol);
    }

    private static boolean checkRow(char symbol) {
        int dotsCount;
        for (char[] chars : map) {
            dotsCount = 0;
            for (char aChar : chars) {
                if (aChar == symbol) {
                    dotsCount++;
                } else {
                    dotsCount = 0;
                }
                if (dotsCount == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkColumn(char symbol) {
        int dotsCount;
        for (int i = 0; i < SIZE; i++) {
            dotsCount = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol){
                    dotsCount++;
                } else {
                    dotsCount = 0;
                }
                if (dotsCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDyagonal(char symbol) {
        return checkMainDiagonal(symbol) || checkSideDiagonal(symbol);
    }

    private static boolean checkMainDiagonal(char symbol) {
        int dotsCount;
        for (int k = - (SIZE - 1); k <= 2* (SIZE - 1); k++) {
            dotsCount = 0;
            for (int i = 0; i <= SIZE-1 ; i++) {
                int j = k + i;
                if ((j >= 0) && (j <= SIZE - 1) && (map[i][j] == symbol)){
                    dotsCount++;
                } else {
                    dotsCount = 0;
                }
                if (dotsCount == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkSideDiagonal(char symbol) {
        int dotsCount;
        for (int k = - (SIZE - 1); k <= 2* (SIZE - 1); k++) {
            dotsCount = 0;
            for (int i = 0; i <= SIZE-1 ; i++) {
                int j = k + (SIZE -1) -i;
                if ((j >= 0) && (j <= SIZE - 1) && (map[i][j] == symbol)){
                    dotsCount++;
                } else {
                    dotsCount = 0;
                }
                if (dotsCount == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAi) {
        if (!isAi && (rowNumber < 1) || (rowNumber > SIZE) || (columnNumber < 1) || (columnNumber > SIZE)) {
            System.out.println("\nПроверте значения строки и столбца");
            return false;
        }
        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAi) {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
            return false;
        }

        return true;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, true);
    }

    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, columnNumber));
        map[rowNumber - 1][columnNumber - 1] = DOT_AI;

    }
}
