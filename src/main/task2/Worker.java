package main.task2;
import main.task2.animals.*;
import main.task2.food.*;

public class Worker {
    public String feed(Animal animal, Food food) {
        return this.getClass().getSimpleName() + " try to feed: " + animal.eat(food);
    }

    public String getVoice(Voice animal) {
        return this.getClass().getSimpleName() + " try to get voice: " + ((Voice)animal).voice() + " sound " + animal.getClass().getSimpleName();
    }
}
