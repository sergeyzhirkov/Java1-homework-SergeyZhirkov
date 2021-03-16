package lesson6;

public abstract class Animal {
    public double limitRun;
    public double limitSwim;
    public double limitJump;

    public boolean run(double length) {
        return limitRun > length;
    }

    public boolean swim(double distance) {
        return limitSwim > distance;
    }

    public boolean jump(double height) {
        return limitJump > height;
    }

    public Animal() {
    }

    public Animal(double limitRun, double limitJump, double limitSwim) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitJump = limitJump;
    }

    public void setLimitRun(double limitRun) {
        this.limitRun = limitRun;
    }

    public void setLimitSwim(double limitSwim) {
        this.limitSwim = limitSwim;
    }

    public void setLimitJump(double limitJump) {
        this.limitJump = limitJump;
    }
}
