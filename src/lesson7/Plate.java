package lesson7;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void decreaseFood(int countDecreaseFood) {
        if (countDecreaseFood > food) {
            System.out.println("trying to eat a plate!");
            return;
        }
        this.food -= countDecreaseFood;
    }
}
