package com.or;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] ageArr = new int[15];

        sortRandom(ageArr);
        System.out.println();
        System.out.println("These are the sorted ages list: " + (Arrays.toString(ageArr)));

    }

    private static void sortRandom(int[] arr) {
        Random r = new Random();

        System.out.println("These are the ages list: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(105);
            System.out.print(" " + arr[i]);
        }
        boolean isStillNotSorted = true;

        while (isStillNotSorted) {

            isStillNotSorted = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                isStillNotSorted = true;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                }
            }
        }
    }
}









