public class Sword<T extends Metal> {

    private T endurance;
    public Sword(T endurance) {
        this.endurance = endurance;
    }

    public boolean isEndurance() {
        if (endurance.getEndurance() > 49) {
            return true;
        } else {
            return false;
        }
    }
}
