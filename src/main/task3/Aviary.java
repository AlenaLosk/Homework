package main.task3;
import main.task3.animals.*;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private SizeOfAviary sizeOfAviary;
    private HashMap<String, T> aviaryMap = new HashMap<>();

    public Aviary(SizeOfAviary sizeOfAviary) {
        this.sizeOfAviary = sizeOfAviary;
    }

    public HashMap<String, T> getAviaryMap() {
        return aviaryMap;
    }

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    public boolean addAnimal(T animal) {
        String animalClass = animal.getClass().getSuperclass().getSimpleName().toLowerCase();
        if (animal.getSizeOfAviary().equals(sizeOfAviary)) {
            aviaryMap.put(animal.getName(), animal);
            return true;
        } else {
            System.out.println("The size of the aviary isn't relevant to the animal " + animal.toString() + "!");
            return false;
        }
    }

    public boolean removeAnimal(T animal) {
        if (aviaryMap.containsKey(animal.getName())) {
            aviaryMap.remove(animal.getName(), animal);
            return true;
        }
        return false;
    }

    public T getAnimal(String name) {
        if (aviaryMap.containsKey(name)) {
            return aviaryMap.get(name);
        }
        return null;
    }
}
