package main.task3.animals;
import main.task3.food.*;

public class Colobus extends Herbivorous implements Run, Climb {
    private int levelOfHunger;
    private int age;
    private boolean isSingle;
    private Gender gender;

    public Colobus(String name) {
        super(name);
        this.setSizeOfAviary(SizeOfAviary.MEDIUM);
        this.setFood(new Banana());
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

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String climb() {
        return this.getClass().getSimpleName() + " climb";
    }

    @Override
    public String run() {
        return this.getClass().getSimpleName() + " run";
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
