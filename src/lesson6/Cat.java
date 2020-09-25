package lesson6;

public class Cat extends Animal {
    public final double LIMIT_RUN_CAT = 200;
    public final double LIMIT_JUMP_CAT = 2;

    public Cat() {
        limitRun = LIMIT_RUN_CAT;
        limitJump = LIMIT_JUMP_CAT;

    }

    public Cat(double limitRun, double limitJump){
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public boolean swim(double distance) {
        return false;
    }
}
