// Write a Java program to check whether the given integer is a multiple of 5 and 7 

import java.util.Scanner;
public class MultipleFiveSeven {
 public static void main(String[] args) {
     Scanner ram = new Scanner(System.in);
       System.out.println("Enter the number: ");
        int num =ram.nextInt();
         if(num%5==0 && num%7==0){ System.out.println(num+" is multiple of 7 or 5.");  }
           else if(num%7==0){
            System.out.println(num+" is multiple of 7."); }
           else if(num%5==0){
            System.out.println(num+" is multiple of 5."); }
            else{
              System.out.println(num+ "Not multiple."); }
            }
         }   

