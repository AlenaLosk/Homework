package main.task2.animals;
import main.task2.food.*;

public abstract class Herbivorous extends Animal {
    @Override
    public String eat(Food food) {
        if (food instanceof Grass) {
            return this.getClass().getSimpleName() + " eat grass";
        } else {
            return this.getClass().getSimpleName() + " doesn't eat meat";
        }
    }
}
