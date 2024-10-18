// Write a program to check whether a given character is an Alphabet or not. 

import java.util.Scanner;

public class checkCharAlphaOrNot {
   public static void main(String[] args) {
     Scanner ram = new Scanner(System.in);
     System.out.println("Enter an alphabet: ");
     char ch= ram.next().charAt(0);
     if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
         System.out.println(ch+" is an alphabet."); }
         else{
             System.out.println(ch+" is not an alphabet."); }
   } 
}
