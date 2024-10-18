// Write a Java program to find the sum of n natural numbers. 

import java.util.Scanner;
public class CheckNaturalNo {
public static void main(String[] args) {
     Scanner ram=new Scanner(System.in);
     System.out.println("Enter an number: ");
     int n=ram.nextInt();
     int natural = (n*(n+1)/2);
     System.out.println("sum of "+ n + " natural number is: " + natural );
}    
}
