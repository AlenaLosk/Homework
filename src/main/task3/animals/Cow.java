package main.task3.animals;
import main.task3.food.*;

public class Cow extends Herbivorous implements Run, Voice {
    private int levelOfHunger;
    private int age;
    private String color;
    private int weight;

    public Cow (String name) {
        super(name);
        this.setSizeOfAviary(SizeOfAviary.LARGE);
        this.setFood(new Oat());
    }

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String run() {
        return this.getClass().getSimpleName() + " run";
    }

    @Override
    public String voice() {
        return "Muuuuu";
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
