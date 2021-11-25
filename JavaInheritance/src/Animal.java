
public class Animal {
    protected int age;
    protected int weight;
    protected boolean isRunning = false;
    protected boolean isEating = false;

    public Animal(int age, int weight, boolean isRunning, boolean isEating) {
        this.age = age;
        this.weight = weight;
        this.isRunning = isRunning;
        this.isEating = isEating;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public boolean isEating() {
        return isEating;
    }
}
