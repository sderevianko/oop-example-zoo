package application;

import animal.Animal;
import cat.Cat;
import cat.WoodenCat;
import dog.Dog;

public class Main {

    public static void main(String[] args) {
        final Cat cat = new Cat(3, "black", "Maine Coon");
        final Dog dog = new Dog("Jack", "brown", "Shepherd");
        final WoodenCat woodenCat = new WoodenCat("wood", "dark brown", "simple cat");

        final Animal siameseCat = new Cat(1, "white", "Siamese cat" );
        final Animal animal = new Animal("unknown", "unknown");

        System.out.println(cat.getAge());
        cat.walk();
        cat.sleep();

        System.out.println(dog.getName());
        dog.walk();
        dog.play();

        System.out.println(woodenCat.getMaterial());
        woodenCat.stand();

        System.out.println("The cat is eating now");
        cat.eat();

        System.out.println("The animal is eating now");
        animal.eat();

        System.out.println("The siamese cat is eating now");
        siameseCat.eat();

        System.out.println(animal.getColor());
        System.out.println(animal.getKind());
    }
}
