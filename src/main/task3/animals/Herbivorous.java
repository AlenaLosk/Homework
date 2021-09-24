package main.task3.animals;
import main.task3.food.*;

public abstract class Herbivorous extends Animal {
    public Herbivorous(String name) {
        super(name);
    }

    @Override
    public String eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            return this.getClass().getSimpleName() + " eat grass";
        } else {
            return this.getClass().getSimpleName() + " doesn't eat meat";
        }
    }
}
