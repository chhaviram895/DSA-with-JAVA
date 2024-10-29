// Write a program that prints the sum of all the even numbers from 1 to 100 using a loop.

import java.util.Scanner;
public class printOneToHundredAdd {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

    System.out.println("Enter an number...");
    int n=ram.nextInt();
    int m=ram.nextInt();
    System.out.println("The even number is-->");
    
    int i=n,sum=0;
    while (i<=m) {
        if(i%2==0){
           System.out.print(i+" "); 
           sum+=i;
        }
        i++;
    }
    System.out.println();
    System.out.println("sum-->"+sum);
   } 
}
