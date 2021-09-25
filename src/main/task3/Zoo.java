package main.task3;
import main.task3.animals.*;
import main.task3.food.*;
import main.task3.animals.Frog;

public class Zoo {
    public static void main(String[] args) throws Exception {
        Aviary<Herbivorous> herbivorous = new Aviary(SizeOfAviary.LARGE);
        herbivorous.addAnimal(new Cow("Maria"));
        herbivorous.addAnimal(new Fish("Som"));
        herbivorous.addAnimal(new Colobus("Martin"));
        herbivorous.addAnimal(new Cow("Nochka"));
        System.out.println(herbivorous.getAviaryMap().toString());
        System.out.println();

        Aviary<Carnivorous> carnivorous = new Aviary(SizeOfAviary.LARGE);
        carnivorous.addAnimal(new Wolf("Ugly"));
        carnivorous.addAnimal(new Duck("Ponochka"));
        carnivorous.addAnimal(new Frog("Princess"));
        System.out.println(carnivorous.getAviaryMap().toString());
        carnivorous.removeAnimal(carnivorous.getAnimal("Ponochka"));
        System.out.println(carnivorous.getAviaryMap().toString());
        System.out.println();

        Animal animal = new Fish("Som");
        Grass grass = new Laminaria();
        System.out.println(animal.eat(grass));

        Animal frog = carnivorous.getAnimal("Princess");
        Food food = new Banana();
        try {
            System.out.println(frog.eat(food));
        } catch (WrongFoodException e) {
            e.printStackTrace();
        } finally {
            food = new Mosquito();
            System.out.println(frog.eat(food));
        }
    }
}
