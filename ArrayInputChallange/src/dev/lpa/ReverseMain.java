package dev.lpa;

import java.util.Arrays;

public class ReverseMain {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 20, 30, 40, 50};
        reverse(testArray);
    }

    public static void reverse(int... intArray) {
        int[] reverseArray = new int[intArray.length];
        int temp = intArray.length - 1;
        for (int i = 0; i < intArray.length; i++) {

            reverseArray[i] = intArray[temp];
            temp -= 1;

        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
