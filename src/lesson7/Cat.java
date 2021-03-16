package lesson7;

import java.util.List;

public class Cat implements Observer {
    private final String name;
    private int appetite;
    private boolean satiety;
    private int countFoodInStomach;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (!satiety && (plate.getFood() > 0) && (appetite > countFoodInStomach)) {
            doEat(plate);
        }
    }

    private void doEat(Plate plate) {
        if (plate.getFood() > appetite - countFoodInStomach) {
            plate.decreaseFood(appetite - countFoodInStomach);
            countFoodInStomach = appetite;
        } else {
            countFoodInStomach += plate.getFood();
            plate.setFood(0);
        }

    }

    private void isSatiet() {
        if (satiety) {
            System.out.printf(" %s is well-fed and sleep, hrrr... \n", name);
            return;
        }
        if (countFoodInStomach >= appetite) {
            satiety = true;
            System.out.printf("cat with name - %s -  is well-fed!  ^..^ \n", name);
        } else {
            System.out.printf("cat with name - %s -  is still hungry! Meow! Meow! :( \n", name);
        }
    }

    @Override
    public void update(List<Plate> plateList) {
        for (Plate plate : plateList) {
            eat(plate);
        }
        isSatiet();
    }
}
