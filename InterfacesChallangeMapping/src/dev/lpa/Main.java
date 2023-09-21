package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("House", "living in there");
        // UtilityLine line = new UtilityLine("LINE","New York 6","Triangle","mm6","60m");
        System.out.println(makeMap(building));

    }

    public static String makeMap(Mappable mappable) {
        if (mappable instanceof Building building) {
            System.out.println("this is building");
            return building.toJSON();
        }
        return "no";
    }
}
