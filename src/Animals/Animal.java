package Animals;

import java.time.LocalDate;

public class Animal {
    private float weight;
    private float height;
    private LocalDate age;

    private String name;
    private Owner owner;


    public Animal(float weight, float height, LocalDate age, String name, Owner owner) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
        this.owner = owner;
    }


    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public LocalDate getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return String.format("weight=%s, height=%s, age=%s,  name=%s, owner=%s",
                weight, height, age, name, owner);
    }

    private String getType() {
        return getClass().getSimpleName();
    }

    private void sleep() {
        System.out.println(getType() + " sleep");
    }

    private void wakeUp() {
        System.out.println(getType() + " wakeup");
    }

    private void eat() {
        System.out.println(getType() + " eat");
    }

    private void play() {
        System.out.println(getType() + " play");
    }


    public void lifeCycle() {
        wakeUp();
        eat();
        play();
        sleep();
    }

}

