package main.task3.food;

public abstract class Food {
    @Override
    public boolean equals(Object o) {
        return  (this == o || getClass() == o.getClass()) ? true : false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
