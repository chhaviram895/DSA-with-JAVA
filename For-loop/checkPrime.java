// Write a program that asks the user to enter a number and then checks whether it is a prime number using a loop.

import java.util.Scanner;

public class checkPrime {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Enter an number...");
    int n=ram.nextInt();
    System.out.println("The number is-->");
    int count=0;
        for(int i=1;i<=n;i++){
             if(n%i==0){
                count++;
             }
        }
        if(count==2){System.out.println("Prime");}
         else {System.out.println("Nope!");}
   } 
}
