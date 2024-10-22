// Write a program that asks the user to enter a number and then prints all the even numbers from 0 to that number  using a loop. 

import java.util.Scanner;

public class printEvenNO {
public static void main(String[] args) {
    Scanner ram=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=ram.nextInt(); int s= 0;
    System.out.println("Result-->");

    for(int i = 0; i<=n;i+=2){
        System.out.print(i+" ");
    }
}    
}
