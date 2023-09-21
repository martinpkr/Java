// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        HybridCar hybridCar = (HybridCar) Car.getCar("Hybrid","a very fast hybrid car",
//                2,8,12,30);
//        hybridCar.drive();
        ElectricCar electicCar = (ElectricCar) Car.getCar("Electirc", "verry cool electric car",
                22, 22, 22, 200);
        electicCar.drive();
    }
}