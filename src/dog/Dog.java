package dog;

import animal.Animal;

public class Dog extends Animal {
    private String name = "Jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing");
    }
}
