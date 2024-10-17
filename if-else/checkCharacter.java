// Write a program to check whether a character is uppercase or lowercase.

import java.util.Scanner;

public class checkCharacter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character: ");
       char ch = sc.next().charAt(0);

       if(Character.isUpperCase(ch)){
        System.out.println("Character is in uppercase!");
      }
        else {
            System.out.println("Character is in Lowercase!");
          }
    
    }
}
