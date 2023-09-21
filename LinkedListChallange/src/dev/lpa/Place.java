package dev.lpa;

public class Place {

    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public static Place getPlace(String name, int distance) {
        return new Place(name, distance);
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' + "\n" +
                "distance = " + distance
                ;
    }
}
