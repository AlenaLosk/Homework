package main.task2.animals;

public class Cow extends Herbivorous implements Run, Voice {
    private int levelOfHunger;
    private int age;
    private String color;
    private int weight;

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
}
