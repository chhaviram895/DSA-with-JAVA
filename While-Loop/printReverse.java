// Write a program that takes a number from user and prints its reverse 

import java.util.Scanner;
public class printReverse {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);

    System.out.println("Enter an number...");
    int n= ram.nextInt();
    System.out.println("The reverse number-->");
    int sum=0;
    while (0<n) {
        int d=n%10;
        sum=sum*10+d;
        n/=10;
    }
    System.out.println(sum);
    }
}
