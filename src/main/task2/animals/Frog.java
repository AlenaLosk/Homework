package main.task2.animals;

public class Frog extends Carnivorous implements Run, Swim, Voice {
    private int levelOfHunger;
    private String color;
    private boolean isToxic;

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isToxic() {
        return isToxic;
    }

    public void setToxic(boolean toxic) {
        isToxic = toxic;
    }

    @Override
    public String run() {
        return this.getClass().getSimpleName() + " run";
    }

    @Override
    public String swim() {
        return this.getClass().getSimpleName() + " swim";
    }

    @Override
    public String voice() {
        return "Qwa-Qwa-Qwa";
    }
}
