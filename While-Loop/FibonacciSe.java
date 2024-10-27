// Write a program that prints the Fibonacci sequence up to a given number using a loop.

import java.util.Scanner;
public class FibonacciSe {
    public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

    System.out.println("Enter the number of element of  Fibonacci series....");
    int n= ram.nextInt();
    System.out.println("Series is-->");
    
    int i=1;   int ft=0;    int st=1;
    while(i<=n){
        int tt=ft+st;
        System.out.print(ft+" ");
        ft=st;  st=tt;
        i++;
     }
}
}
