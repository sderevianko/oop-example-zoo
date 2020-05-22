package animal;

public class Animal {

    private final String color;
    private final String kind;

    public Animal (String color, String kind) {
        this.color = color;
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public void eat() {
        System.out.println("Eating");
    }
}
