// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().setHasWorkToDo(true);
        smartKitchen.getDishWasher().doDishes();
    }
}