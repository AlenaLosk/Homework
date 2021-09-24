package main.task3.animals;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        super("The type of food isn't appropriate to the animal!");
    }
    public WrongFoodException(String str) {
        super("The type of food isn't appropriate to the animal! " + str);
    }
}
