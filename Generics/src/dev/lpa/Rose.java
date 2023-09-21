package dev.lpa;

public class Rose extends Plant {
    private String smell;

    public Rose(String name, String color, boolean poison, String smell) {
        super(name, color, poison);
        this.smell = smell;

    }

    public void printSmell() {
        System.out.println(this.getClass().getSimpleName() + "smells: " + smell);
    }
}
