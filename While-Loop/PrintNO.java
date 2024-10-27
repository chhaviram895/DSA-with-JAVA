// Write a program that prints all the numbers from 1 to 10 using a loop.

import java.util.Scanner;
public class PrintNO {
 public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Enter an number...");
    int n= ram.nextInt();
    System.out.println("Number-->"); 
    int i=0;
    while(i<=n){
        System.out.print(i+" ");
        i++;
    }
    }
}