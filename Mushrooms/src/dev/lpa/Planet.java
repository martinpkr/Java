package dev.lpa;

public class Planet {
    private String name;
    private String size;
    private int moons;
    private boolean possibleLife;

    public Planet(String name, String size, int moons, boolean possibleLife) {
        this.name = name;
        this.size = size;
        this.moons = moons;
        this.possibleLife = possibleLife;
    }
}
