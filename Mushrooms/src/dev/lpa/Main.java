package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Mushroom pechurka = new Mushroom("Agaricus arvensis", "White", false);
        pechurka.checkForPoison();
        Mushroom muhomorka = new Mushroom("Amanita muscaria", "red", false);
        muhomorka.checkForPoison();
        Plant rose = new Plant("Rose", false, false);
        Animal bear = new Animal("Mecho", 4, false);


    }
}
