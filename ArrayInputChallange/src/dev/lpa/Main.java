package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readIntegers();
    }

    public static void readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me integers seperated by comma and space = '1, 2, 3, 4' ");
        String input = s.nextLine();
        String[] numArray = input.split(", ");
        int[] newArray = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            newArray[i] = Integer.parseInt(numArray[i]);
        }
        System.out.println(findMin(newArray));
    }

    public static int findMin(int... numberArray) {

        Arrays.sort(numberArray);
        return numberArray[0];
    }
}
