package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Animal cat2 = new Cat(300, 5);
        Dog dog2 = new Dog(600, 1, 20);

        System.out.println(cat1.run(250) + " " + cat2.run(250));
        System.out.println(cat1.swim(0) + " " + cat2.swim(100));

        System.out.println(dog1.run(550) + " " + dog2.run(550));
        System.out.println(dog1.swim(15) + " " + dog2.swim(15));
    }
}
