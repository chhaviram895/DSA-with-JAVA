// Write a program that asks the user to enter a number and then prints all the even numbers from 0 to that number using a loop. 
import java.util.Scanner;
public class printEven {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number...");
        int n=ram.nextInt();
        System.out.println("Even number is-->");
       
        int i=0;
        while(i<=n){
           if (i%2==0) {
             System.out.print(i+" ");
           } 
           i+=2;
        }
        System.out.println();
    }
}
