package dev.lpa;

public class Earth extends Planet {

    private long population;
    private Living living;

    public Earth(String name, String size, int moons, boolean possibleLife, long population, Living living) {
        super(name, size, moons, possibleLife);
        this.population = population;
        this.living = living;
    }

    public void printPopulation() {
        System.out.println("population of earth currently is " + population + " and it's still growing");
    }


}
