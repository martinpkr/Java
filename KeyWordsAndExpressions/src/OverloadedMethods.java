public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(convertToCantimeters(2,3));
    }
    public static double convertToCantimeters(int inches){
        double cantimeters = inches * 2.54;
        return cantimeters;
    }


    public static double convertToCantimeters(int feet, int inches){
        int combinedInches = (int) inches + (feet * 12);
        return convertToCantimeters(combinedInches);
    }

}
