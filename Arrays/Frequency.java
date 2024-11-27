// Write a Java program to find the frequency of an element in an    array.

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int[]arr={1,2,3,3,3,3,3,3,3,3,3,3,3,4,5,5,4,3};
        System.out.println("Enter an no....");
        int n = ram.nextInt();
        int freq=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]==n) {
                freq++;
            }
        }
        System.out.println(freq);
    }
}
