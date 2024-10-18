// Write a Java program that accepts three numbers and checks whether all numbers are equal or not

import java.util.Scanner;
public class ThreeNoEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the Third number: ");
        int num3=sc.nextInt();
        if(num1==num2 && num1==num3){
            System.out.println("All numbers are equal."); }
        else if(num1==num2 || num1==num3 || num2==num3){
            System.out.println("Neither all are equal nor different."); }
        else{
            System.out.println("All numbers are different."); }
    }
    }

