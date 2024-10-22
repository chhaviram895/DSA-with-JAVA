// Write a program that prints the multiplication table of a given number using a loop.

import java.util.Scanner;

public class printTable {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
System.out.println("Enter an number...");
        int n= ram.nextInt();
        System.out.println("Table is-->");

        for(int i=1; i<=10;i++){
            int Table =n*i;
             System.out.print(Table+" ");
         }
   } 
}
