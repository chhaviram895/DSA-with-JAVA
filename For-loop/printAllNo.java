// Write a program that asks the user to enter a number and then prints the sum of all the digits in that number using a loop.

import java.util.Scanner;
public class printAllNo {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);

        System.out.println("Enter an number...");
        int n=ram.nextInt(),count=1;
        System.out.println("Sum is-->");
         
        for(int i=0;i<=n;i++){
            int d=n%10;
            count+=d;
            n/=10;
        }
    System.out.println(count);
    }
}
