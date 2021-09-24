package main.task1;
import main.task1.model.*;

public class Application {
    public static void main(String[] args) {
        Kotik cat1 = new Kotik(5, "Кузя", 8, "мяууу");
        Kotik cat2 = new Kotik();
        cat2.setKotik(8, "Барсик", 5, "мур-мур");
        cat2.liveAnotherDay();
        System.out.println("Котик " + cat2.getName() + " весит " + cat2.getWeight() + " кг");
        System.out.println("Одинаково ли мяукают котики? " + cat1.getMeow().equals(cat2.getMeow()));
        System.out.println("В программе было создано " + Kotik.getCounter() + " котиков(а)");
    }
}
