package main.task2.animals;
import main.task2.food.*;

public abstract class Carnivorous extends Animal {
    @Override
    public String eat(Food food) {
        if (food instanceof Meat) {
            return this.getClass().getSimpleName() + " eat meat";
        } else {
            return this.getClass().getSimpleName() + " doesn't eat grass";
        }
    }
}
