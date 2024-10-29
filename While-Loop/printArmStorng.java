// Write a program that asks the user to enter a number and then prints whether it is an Armstrong number or not using a loop.

import java.util.Scanner;
public class printArmStorng {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);

        System.out.println("Enter an number...");
        int n= ram.nextInt();
        System.out.println("The number is-->");  
        
        int sum =0;   int or=n;
        while (n>0) {
          int d=n%10;
          sum+=d*d*d;
          n/=10;
        }
        if(sum==or){
            System.out.println("Arm.");
        }else{
            System.out.println("Nope!");
        }
    }
}
