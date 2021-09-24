package main.task3.animals;
import main.task3.food.*;

public class Frog extends Carnivorous implements Run, Swim, Voice {
    private int levelOfHunger;
    private String color;
    private boolean isToxic;

    public Frog (String name) {
        super(name);
        this.setSizeOfAviary(SizeOfAviary.LARGE);
        this.setFood(new Mosquito());
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

    @Override
    public String eat(Food food) throws WrongFoodException {
        if (food.equals(this.getFood())) {
            return this.getClass().getSimpleName() + " eat " + food.getClass().getSimpleName();
        } else {
            throw new WrongFoodException(this.getClass().getSimpleName() + " doesn't eat " + food.getClass().getSimpleName() + "!");
        }
    }
}
