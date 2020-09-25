package lesson6;

public class Dog extends Animal {
    public final double LIMIT_RUN_DOG = 500;
    public final double LIMIT_SWIM_DOG = 10;
    public final double LIMIT_JUMP_DOG = 0.5;

    public Dog() {
        limitRun = LIMIT_RUN_DOG;
        limitJump = LIMIT_JUMP_DOG;
        limitSwim = LIMIT_SWIM_DOG;
    }

    public Dog(double limitRun, double limitJump, double limitSwim) {
        super(limitRun, limitJump, limitSwim);
    }
}
