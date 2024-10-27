// Write a program that asks the user to enter a number and then prints the factorial of that number using a loop.

import java.util.Scanner;
public class printFactorial {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

System.out.println("Enter an number...");
        int n= ram.nextInt();
System.out.println("Factorial number is-->");
        int i=1; int ans=1;  
        while(i<=n){
            ans*=i;
            i++;
        }
        System.out.println(ans);
   } 
}
