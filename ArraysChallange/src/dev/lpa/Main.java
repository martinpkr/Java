package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);

        int[] descendingArray = new int[20];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            count++;
            System.out.println(i);
            descendingArray[count - 1] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(descendingArray));



    }
}
