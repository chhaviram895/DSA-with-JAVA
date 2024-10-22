// Write a programme that asks the user to enter a number and then prints all the prime numbers up to that number using a loop.

import java.util.Scanner;

public class printAllPrime {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
 
        System.out.println("Enter two numbers...");
        int a = ram.nextInt();
        int b = ram.nextInt();
        System.out.println("The Prime numbers are-->");

        for(int i=a;i<=b;i++){
            int k=i;
            boolean flag=true;

            for(int j=2;j<=k-1;j++){
                if(k%j==0){
                    flag=false;
                }
            }
            
                if(flag==true){
                System.out.println(k);
                }
        }
   } 
}
