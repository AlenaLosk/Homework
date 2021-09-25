package main.task2.animals;

public class Duck extends Carnivorous implements Fly, Swim, Voice, Run {
    private int levelOfHunger;
    private String color;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String fly() {
        return this.getClass().getSimpleName() + " fly";
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
        return "Krya-krya";
    }
}
