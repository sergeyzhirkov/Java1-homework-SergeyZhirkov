package lesson5;

public class Employee {
    String fio;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fio, String post, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + fio + '\'' +
                ", должность='" + post + '\'' +
                ", email='" + email + '\'' +
                ", тел.номер='" + phoneNumber + '\'' +
                ", зарплата=" + salary +
                ", возраст=" + age +
                '}';
    }

    public void printInfo() {
        System.out.println(toString());
    }
}
