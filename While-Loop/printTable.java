// Write a program that prints the multiplication table of a given number using a loop.
import java.util.Scanner;
public class printTable {
  public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);

        System.out.println("Enter an number...");
        int n =ram.nextInt();
        System.out.println("Multiplication table is-->");
        int i=1;
        while(i<=10){
            int ans=n*i;
            System.out.print(ans+" ");
            i++;
        }
  }  
}
