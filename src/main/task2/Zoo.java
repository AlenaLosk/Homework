package main.task2;
import main.task2.animals.*;
import main.task2.animals.Frog;
import main.task2.food.*;

public class Zoo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Fish fish = new Fish();
        Worker worker = new Worker();
        System.out.println(worker.feed(cow, new Mosquito()));
        System.out.println(worker.feed(cow, new Oat()));
        System.out.println(worker.feed(fish, new Laminaria()));
        System.out.println(worker.feed(fish, new Beef()));
        System.out.println(worker.getVoice(cow));
        try {
            System.out.println(worker.getVoice((Voice) fish));
        } catch (ClassCastException e) {
            e.printStackTrace();
        } finally {
            Animal[] pond = {new Duck(), new Fish(), new Frog(), new Fish()};
            for (Animal animal: pond) {
                System.out.println(((Swim) animal).swim());
            }
        }
    }
}
