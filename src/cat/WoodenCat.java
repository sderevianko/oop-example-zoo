package cat;

import animal.Animal;

public class WoodenCat extends Animal {
    private int numberOfChildren = 4;

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}
