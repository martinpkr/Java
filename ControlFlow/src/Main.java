// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (count <= 5) {
            try {
                System.out.println("Write number " + count + ": ");
                String numberInput = scanner.nextLine();
                int parsedInput = Integer.parseInt(numberInput);
                count += 1;

            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }


    }


}