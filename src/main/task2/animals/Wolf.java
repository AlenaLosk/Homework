package main.task2.animals;

public class Wolf extends Carnivorous implements Run, Voice {
    private int levelOfHunger;
    private int age;
    private boolean isSingle;
    private Gender gender;

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
    public String run() {
        return this.getClass().getSimpleName() + " run";
    }

    @Override
    public String voice() {
        return "Uuuuuu";
    }
}
