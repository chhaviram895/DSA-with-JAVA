// Write a program that asks the user to enter a number and then prints the factorial of that number using a loop.

import java.util.Scanner;

public class printFactorialNo {
   public static void main(String[] args){
    Scanner ram = new Scanner(System.in);

    System.out.println("Enter an number...");
    int n=ram.nextInt() , ans=1;
    System.out.println("Factorial is-->");
    for(int i=1;i<=n;i++){
        ans*=i;
        System.out.print(ans+" "); 
    }
    System.out.println(); 
    System.out.println(ans); 
   } 
}
