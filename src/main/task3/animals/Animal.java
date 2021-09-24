package main.task3.animals;
import main.task3.food.*;

public abstract class Animal {
    private String name;
    private SizeOfAviary sizeOfAviary;
    private Food food;

    public Animal() {
        name = "Jacob";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setSizeOfAviary(SizeOfAviary sizeOfAviary) {
        this.sizeOfAviary = sizeOfAviary;
    }

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String eat(Food food) throws WrongFoodException {
        return this.getClass().getSimpleName() + " eat food";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " {name='" + name + '\'' +
                ", sizeOfAviary=" + sizeOfAviary +
                ", food=" + food +
                '}';
    }
}
