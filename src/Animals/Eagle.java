package Animals;

import Animals.Animal;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable, Goable {
    public Eagle(float weight, float height, LocalDate age, String name, Owner owner) {
        super(weight, height, age, name, owner);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public LocalDate getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Owner getOwner() {
        return super.getOwner();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void lifeCycle() {
        super.lifeCycle();
    }


    @Override
    public double fly() {
        return  10;
    }

    @Override
    public double run() {
        return 1.5;
    }
}
