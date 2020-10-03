package lesson7;

import java.util.LinkedList;
import java.util.List;

public class PlateObserver implements Observable {
    private List<Observer> observers;
    private List<Plate> plates;
    private float temperature;
    private float humidity;
    private int pressure;

    public PlateObserver() {
        observers = new LinkedList<>();
        plates = new LinkedList<>();
    }

    public void addPlate(Plate plate) {
        plates.add(plate);
    }

    public void deletePlate(Plate plate) {
        plates.remove(plate);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(plates);
    }

    public void wowNewFoodFromPeople(int countFoodToAdd) {
        for (Plate plate : plates) {
            plate.addFood(countFoodToAdd);
        }
        notifyObservers();
    }

    public void putThePlates() {
        notifyObservers();
    }

}
