// Write a Java program to check whether the given integer is a multiple of 5


import java.util.Scanner;
public class MultipleFive {
    public static void main(String[] args) {
       Scanner ram = new Scanner(System.in);
      System.out.println("Enter the number :");
        int num =ram.nextInt();
         if(num%5==0){
            System.out.println(num +" is a multiple of 5"); }
        else{
            System.out.println(num +" is not a multiple of 5"); }
    }
}