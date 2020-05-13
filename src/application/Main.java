package application;

import animal.Animal;
import cat.Cat;
import cat.WoodenCat;
import dog.Dog;

public class Main {

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        WoodenCat w = new WoodenCat();
        Animal a = new Cat();
        Animal an = new Animal();

        System.out.println(c.getAge());
        c.sleep();
        System.out.println(d.getName());
        d.play();
        System.out.println(w.getNumberOfChildren());
        w.hunt();
        a.eat();
        System.out.println(an.getColor());
        System.out.println(an.getKind());
    }
}
