// Write a program to find the power of a number Take two inputs. 

import java.util.Scanner;

public class FindPower {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

        System.out.println("Enter an Number and Power...");
        int x=ram.nextInt();
        int n=ram.nextInt();
        System.out.println("Result-->");

        
        int p=1;
        for(int i=1;n>0;i++){
            p*=x;
            n--;
        }
        System.out.println(p);
   } 
}
