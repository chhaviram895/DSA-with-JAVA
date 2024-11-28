// Write a Java program to find the difference between the largest and smallest elements in an array.

import java.util.Scanner;

public class DiffLargSmall {
    public static void main(String[] args) {
        int[] arr = {  4, 5, 6, 7, 8, 9 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max - min);

    }
}