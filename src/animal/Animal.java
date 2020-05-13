package animal;

public class Animal {
    private String color = "black";
    private String kind = "good";

    public void eat() {
        System.out.println("Eating");
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
