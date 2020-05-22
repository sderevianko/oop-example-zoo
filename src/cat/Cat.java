package cat;

import animal.Animal;
import animal.Walkable;

public class Cat extends Animal implements Walkable {

    private final int age;

    public Cat (int age, String color, String kind) {
        super(color, kind);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void walk() {
        System.out.println("The cat is walking now");
    }
}
