import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isNum = true;
        int count = 0;
        int savedNumberMax = 0;
        int savedNumberMin = 0;
        while (isNum) {

            try {
                System.out.println("Give me a number: ");
                String inputNumber = scanner.nextLine();
                int parsedStringToNumber = Integer.parseInt(inputNumber);
                if (count == 0) {
                    savedNumberMin = parsedStringToNumber;
                }
                if (parsedStringToNumber > savedNumberMax) {
                    savedNumberMax = parsedStringToNumber;
                }
                if (parsedStringToNumber < savedNumberMin) {
                    savedNumberMin = parsedStringToNumber;
                }
                System.out.println("The lowest number for now is: " + savedNumberMin + " and the highest number is " + savedNumberMax + "the current number you typed was: " + parsedStringToNumber);
                count += 1;
            } catch (Exception e) {
                System.out.println("Not a Number");
                isNum = false;
            }
        }
    }
}
