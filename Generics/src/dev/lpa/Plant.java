package dev.lpa;

public class Plant {
    private String name;
    private String color;
    private boolean poison;

    public Plant(String name, String color, boolean poison) {
        this.name = name;
        this.color = color;
        this.poison = poison;
    }


}

class Lavander extends Plant {
    private String smell;

    public Lavander(String name, String color, boolean poison) {
        super(name, color, poison);

    }

    public void printSmell() {
        System.out.println(this.getClass().getSimpleName() + "smells: " + smell);
    }
}
