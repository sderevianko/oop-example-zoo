package cat;

import animal.Animal;

public class WoodenCat extends Animal {

    private String material;

    public WoodenCat (String material, String color, String kind) {
        super(color, kind);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void stand() {
        System.out.println("Standing on the table");
    }
}
