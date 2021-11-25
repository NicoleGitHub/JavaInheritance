public class Felidae extends Animal{
    protected boolean isMeowing = false;

    public boolean isMeowing() {
        return isMeowing;
    }

    public void setMeowing(boolean meowing) {
        isMeowing = meowing;
    }

    public Felidae(int age, int weight, boolean isRunning, boolean isEating, boolean meowing) {
        super(age, weight, isRunning, isEating);
        this.isMeowing = meowing;
    }
}
