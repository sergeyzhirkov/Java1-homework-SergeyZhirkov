package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] arrayOfEmployee = new Employee[5];
        for (int i = 0; i < 5; i++) {
            arrayOfEmployee[i] = new Employee("" + i + i + i, "" + i + i, "email " + i, "8952000000" + i, 30000 + i, 38 + i);
        }

        for (int i = 0; i < 5; i++) {
            if (arrayOfEmployee[i].age > 40) {
                arrayOfEmployee[i].printInfo();
            }
        }
    }
}
