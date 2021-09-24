package main.task1.model;

public class Kotik {
    private static int counter;
    private int levelOfHunger = 10;
    private String name;
    private int weight;
    private int prettiness;
    private String meow;

    public Kotik() {
        counter++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this();
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getCounter() {
        return counter;
    }

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public boolean play() {
        if (levelOfHunger > 1) {
            levelOfHunger -= 5;
            System.out.println("Котик " + name + " поиграл");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean sleep() {
        if (levelOfHunger > 1) {
            levelOfHunger -= 5;
            System.out.println("Котик " + name + " поспал");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean chaseMouse() {
        if (levelOfHunger > 1) {
            levelOfHunger -= 5;
            System.out.println("Котик " + name + " поймал мышь");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean sayMurr() {
        if (levelOfHunger > 1) {
            levelOfHunger -= 5;
            System.out.println("Котик " + name + " сказал " + meow);
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean walk() {
        if (levelOfHunger > 1) {
            levelOfHunger -= 5;
            System.out.println("Котик " + name + " прогулялся");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean eat() {
        return eat(20, "мясо");
    }

    public boolean eat(int levelOfHunger) {
        this.levelOfHunger += levelOfHunger;
        System.out.println("Котик " + name + " поел");
        return true;
    }

    public boolean eat(int levelOfHunger, String nameOfEat) {
        this.levelOfHunger += levelOfHunger;
        System.out.println("Котик " + name + " поел " + nameOfEat);
        return true;
    }

    public void liveAnotherDay() {
        int number;
        for (int i = 0; i < 24; i++) {
            number = (int) (Math.random() * 5 + 1);
            switch (number) {
                case 1:
                    if (!play()) {
                        eat();
                        play();
                    }
                    break;
                case 2:
                    if (!sleep()) {
                        eat();
                        sleep();
                    }
                    break;
                case 3:
                    if (!chaseMouse()) {
                        eat(15, "сухой корм");
                        chaseMouse();
                    }
                    break;
                case 4:
                    if (!sayMurr()) {
                        eat();
                        sayMurr();
                    }
                    break;
                case 5:
                    if (!walk()) {
                        eat(30, "сметану");
                        walk();
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Котик " + name + " устал и день подошел к концу!");
        System.out.println("------------------------------------------------");
    }
}

