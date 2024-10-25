// Write a program that asks the user to enter a string and then prints the reverse of that string using a loop.

import java.util.Scanner;

public class printReversString {
   public static void main(String[] args) {
    Scanner  ram = new Scanner(System.in);

    System.out.println("Written a sentence...");
    String str=ram.nextLine();
    System.out.println("Revesre String is-->");

    String ans="";    
    for(int i=str.length()-1;i>=0;i--){
    char ch= str.charAt(i);
    ans+=ch;
}
    System.out.println(ans+"");
   } 
}
