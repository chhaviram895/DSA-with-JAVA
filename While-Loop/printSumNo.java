// Write a program that asks the user to enter a number and then prints the sum of the digits

import java.util.Scanner;

public class printSumNo {
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
