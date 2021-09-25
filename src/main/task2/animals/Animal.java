package main.task2.animals;
import main.task2.food.*;

public abstract class Animal {
    public String eat(Food food) {
        return this.getClass().getSimpleName() + " eat food";
    }
}
