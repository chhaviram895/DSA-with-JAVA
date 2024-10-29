// Write a program that asks the user to enter a string and then prints the reverse of that string using a loop.

import java.util.Scanner;
public class printReverseString {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Wriiten the sentence...");
        String str = ram.nextLine();
        System.out.println("Reverse string is-->");
       
        int i=str.length()-1;   String ans="";
        while(i>=0){
            char ch = str.charAt(i);
              ans+=ch;
            i--;
        }
        System.out.println(ans);
   } 
}
