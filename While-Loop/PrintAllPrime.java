// Write a programme that asks the user to enter a number and then prints all the prime numbers up to that number using a loop.
import java.util.Scanner;
public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner ram= new Scanner(System.in);

        System.out.println("Enter two number : ");
        int a=ram.nextInt();
        int b=ram.nextInt();
        System.out.println("The Prime numbers are-->");

        int i=a;
        while(i<=b){
        int k=i; 
        boolean flag=true;
        int j=2;
        while(j<=k-1){
            if(k%j==0){
            flag=false; }
            j++;}
      if(flag==true){
          System.out.print(k+" "); }
          i++;}       
        }
    }
        