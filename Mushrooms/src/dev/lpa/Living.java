package dev.lpa;

public class Living {

    private Animal animal;
    private Mushroom mushroom;
    private Plant plant;

    public Living(Animal animal, Mushroom mushroom, Plant plant) {
        this.animal = animal;
        this.mushroom = mushroom;
        this.plant = plant;
    }

    public void whatIsLiving() {
        System.out.println("Living things on earth are:" + animal.getClass().getSimpleName() + " " + mushroom.getClass().getSimpleName() + " " + plant.getClass().getSimpleName());
    }
}

class Animal {
    private String name;
    private int legs;
    private boolean extinct;

    public Animal(String name, int legs, boolean extinct) {
        this.name = name;
        this.legs = legs;
        this.extinct = extinct;
    }

    public void checkIfItsBug() {
        if (legs > 4) {
            System.out.println(name + "Is a bug!");
        } else {
            System.out.println(name + "Is not a bug!");
        }
    }


}

class Mushroom {
    private String name;
    private String color;
    private boolean poisonous;

    public Mushroom(String name, String color, boolean poisonous) {
        this.name = name;
        this.color = color;
        this.poisonous = poisonous;
    }

    public static void printPoison(boolean isPoisonous) {
        if (isPoisonous) {
            System.out.println("This Mushroom is poisonous");
        } else {
            System.out.println("This Mushroom is not poisonous");
        }
    }

    public void checkForPoison() {
        if (name.contains("Agaricus")) {
            poisonous = false;
            printPoison(poisonous);
        } else if (name.contains("Amanita")) {
            poisonous = true;
            printPoison(poisonous);
        } else {
            poisonous = false;
        }
    }

}

class Plant {
    private String name;
    private boolean isTree;
    private boolean poisonous;

    public Plant(String name, boolean isTree, boolean poisonous) {
        this.name = name;
        this.isTree = isTree;
        this.poisonous = poisonous;
    }


}
