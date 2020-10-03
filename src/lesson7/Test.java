package lesson7;

public class Test {
    public static void main(String[] args) {
        PlateObserver humanObserver = new PlateObserver();
        Cat cat1 = new Cat("Tim", 100);
        Cat cat2 = new Cat("Vaska",20);
        Cat cat3 = new Cat("Leopold", 1000);

        humanObserver.registerObserver(cat1);
        humanObserver.registerObserver(cat2);
        humanObserver.registerObserver(cat3);

        Plate plate1 = new Plate(50);
        Plate plate2 = new Plate(20);
        Plate plate3 = new Plate(10);

        humanObserver.addPlate(plate1);
        humanObserver.addPlate(plate2);
        humanObserver.addPlate(plate3);

        humanObserver.putThePlates();

        humanObserver.wowNewFoodFromPeople(100);
        humanObserver.wowNewFoodFromPeople(200);
        humanObserver.wowNewFoodFromPeople(200);
        humanObserver.wowNewFoodFromPeople(100);
    }
}
