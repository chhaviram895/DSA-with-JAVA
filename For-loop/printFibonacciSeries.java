// Write a program that prints the Fibonacci sequence up to a given number using a loop.

import java.util.Scanner;

public class printFibonacciSeries {
   public static void main(String[] args) {
    Scanner ram=new Scanner(System.in);
    System.out.println("Enter the no...");
    int n=ram.nextInt(), ft=0, st=1;
    System.out.println("--->>");
    for(int i = 1; i<=n;i++){
        int tt=ft+st;
        System.out.print(ft+" ");
        ft=st; st=tt;
    }

   } 
}
