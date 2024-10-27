// Write a program that asks the user to enter a number and then checks whether it is a prime number using a loop.
import java.util.Scanner;
public class CheckPrime {
 public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

    System.out.println("Enter an number...");
    int n= ram.nextInt();
    System.out.println("The number is-->");
    int i=1; int count=0;
    while (i<=n) {
        if(n%i==0){
            count++;  }
            i++;
        }
    if(count==2){
        System.out.println("Prime.");
    }
    else{
        System.out.println("Nope!");
    }
 }   
}
