// Write a program that takes a number from user and prints its reverse 

import java.util.Scanner;

public class printReverse {
 public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
        System.out.println("Enter an digit number...");
        int n= ram.nextInt();
        System.out.println("Reverse-->");

        int count=0;
        for(int i=1;0<n;i++){
            int d=n%10;
            count=count*10+d;
            n/=10;
        }
        System.out.println(count+" ");
 }   
}
