package main.task3.animals;
import main.task3.food.*;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public String eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            return this.getClass().getSimpleName() + " eat meat";
        } else {
            return this.getClass().getSimpleName() + " doesn't eat grass";
        }
    }
}
