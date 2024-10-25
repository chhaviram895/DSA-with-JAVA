// Write a program that asks the user to enter a number and then prints whether it is an Armstrong number or not using a loop.

import java.util.Scanner;
public class printArmStrong {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
     System.out.println("Enter an number...");
    int n=ram.nextInt();
    int or=n;
    System.out.println("Number is-->");
    int count=1;
        for(int i=0;i<=n;i++){
            int d = n%10;
            count+=d*d*d;
            n/=10;
        }
        if(count==or){System.out.println("ArmStrong.");}
        else{System.out.println("Nope!");}
    }
}