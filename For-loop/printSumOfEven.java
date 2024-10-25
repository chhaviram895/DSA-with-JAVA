// Write a program that prints the sum of all the even numbers from 1 to 100 using a loop.

import java.util.Scanner;

public class printSumOfEven {
    public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Enter two numbers...");
        int a=ram.nextInt();
        int b=ram.nextInt();
        System.out.print("Even numbers are : ");
           
        int sum =0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers-->"+sum);
    }
}