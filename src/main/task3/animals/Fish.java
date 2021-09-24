package main.task3.animals;
import main.task3.food.*;

public class Fish extends Herbivorous implements Swim {
    private int levelOfHunger;
    private String color;
    private int countOfFlippers;

    public Fish (String name) {
        super(name);
        this.setSizeOfAviary(SizeOfAviary.SMALL);
        this.setFood(new Laminaria());
    }

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

    @Override
    public String eat(Food food) throws WrongFoodException {
        if (food.equals(this.getFood())) {
            return this.getClass().getSimpleName() + " eat " + food.getClass().getSimpleName();
        } else {
            throw new WrongFoodException(this.getClass().getSimpleName() + " doesn't eat " + food.getClass().getSimpleName() + "!");
        }
    }
}
