package Animals;

import java.time.LocalDate;

public class BlueWhale extends Animal implements Swimable{
    public BlueWhale(float weight, float height, LocalDate age, String name, Owner owner) {
        super(weight, height, age, name, owner);
    }

    @Override
    public double swim() {
        return 10;
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
}
