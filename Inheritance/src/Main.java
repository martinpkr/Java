// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Some Animal", "Huge", 100);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        dog.windTail();
        dog.move("fast");
        Dog pufi = new Dog("Amazonsko kuche", "Huge", 40, "pinky", "straight");
        pufi.windTail();
        pufi.move("fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
    }
}