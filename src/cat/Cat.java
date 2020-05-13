package cat;

import animal.Animal;

public class Cat extends Animal {
    private int age = 7;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}
