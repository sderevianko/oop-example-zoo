package dog;

import animal.Animal;
import animal.Walkable;

public class Dog extends Animal implements Walkable {

    private String name;

    public Dog (String name, String color, String kind) {
        super(color, kind);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void walk() {
        System.out.println("The dog is walking now");
    }
}
