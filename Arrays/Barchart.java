// Write a program to print the array elements in the barchart form

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int[] arr = { 8, 6, 2, 1, 9, 4, 3 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int level = max; level >= 1; level--) {
            for (int i = 0; i < arr.length; i++) {
                if (level <= arr[i])
                    System.out.print("*\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }

    }
}
