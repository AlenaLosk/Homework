package main.task2.animals;

public class Fish extends Herbivorous implements Swim {
    private int levelOfHunger;
    private String color;
    private int countOfFlippers;

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

    public int getCountOfFlippers() {
        return countOfFlippers;
    }

    public void setCountOfFlippers(int countOfFlippers) {
        this.countOfFlippers = countOfFlippers;
    }

    @Override
    public String swim() {
        return this.getClass().getSimpleName() + " swim";
    }
}
