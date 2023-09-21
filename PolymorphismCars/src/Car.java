import java.util.Scanner;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public static Car getCar(String type, String description, int cylinders, double avgKmPerLite, double avgKmPerCharge, int batterySize) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, avgKmPerLite, cylinders, batterySize);
            case 'H' -> new HybridCar(description, avgKmPerLite, batterySize, cylinders);
            case 'E' -> new ElectricCar(description, avgKmPerCharge, batterySize);
            default -> new Car(description);
        };
    }

    public void startEngine() {
        System.out.println("The " + description + " has started its engine");
        System.out.println("brr brr brrrrr");
    }

    public void drive() {
        System.out.println("The car is driving on the road");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("The " + description + " engine is running strong");
    }

}

class GasPoweredCar extends Car {
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("We are driving an gas car, be careful " +
                ", because we are making smoke trails if we push our car too much");
    }
}

class ElectricCar extends Car {
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("The engine is started but cannot be heard, this is because" +
                "we are driving an electric car");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("We are driving an electric car, be careful" +
                " out there because others probably wont hear the car");

    }
}

class HybridCar extends Car {
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.print("What is your prefered method of driving?");
        Scanner s = new Scanner(System.in);
        String prefferedUserMethod = s.nextLine();
        if (prefferedUserMethod.equals("battery")) {
            System.out.println("Thanks for being good to nature!!!");
        } else {
            System.out.println("You may be old fashoned but that is what makes you cool");
        }
    }
}