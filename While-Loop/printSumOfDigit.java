// Write a program that asks the user to enter a number and then prints the sum of all the digits in that number using a loop.

import java.util.Scanner;
public class printSumOfDigit {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

    System.out.println("Enter the digits....");
    int n= ram.nextInt();
    System.out.println("The sum of digit-->");

    int sum=0;
        while (n>0) {
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
    }
}