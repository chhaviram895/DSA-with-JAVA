// Write a program that asks the user to enter a number and then prints the sum of the digits

import java.util.Scanner;

public class printSumOfDigit {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);

        System.out.println("Enter the digit number...");
        int n=ram.nextInt();
        System.out.println("Reverse Digit-->");
 
        int count=1;
        for(int i=0; i<=n;i++){
           int d=n%10;
           count+=d;
           n/=10;
        }
        System.out.println(count+"");
    }
}
