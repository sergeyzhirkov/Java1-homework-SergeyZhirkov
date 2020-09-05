package lesson1;

public class Main {
    public static void main(String[] args) {
        byte byteVariable = 0;
        short shortVariable = 1;
        int intVariable = 2;
        long longVariable = 3;
        float floatVariable = 0.1f;
        double doubleVariable = 0.2;
        char charVariable = 'a';
        boolean flag = true;

        System.out.println(calculate(10, 3, 2,1));
        System.out.println(between10and20(13, 5));
        isPossitiveOrNegative(-3);
        System.out.println(isNegative(4));
        printMassage("Sergey");
        leapYear(2020);
    }

    public static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean between10and20( int a, int b){
        return (a+b >=10) && (a+b<=20);
    }

    public static void isPossitiveOrNegative(int x){
        if (x<0) {
            System.out.println("отрицательное число");;
        } else {
            System.out.println("положительное число");
        }
    }

    public static boolean isNegative(int x){
        return x<0;
    }

    public static void printMassage(String name){
        System.out.printf("Привет, %s!%n", name);
    }

    public static void leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year %400 == 0)){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - НЕвисокосный год");
        }
    }
}
