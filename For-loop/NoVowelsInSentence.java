// Write a program that asks the user to enter a sentence and then prints the number of vowels in the sentence using a loop.

import java.util.Scanner;

public class NoVowelsInSentence {
   public static void main(String[] args){
    Scanner ram=new Scanner(System.in);
    System.out.println("Enter the sentence : ");
    String str =ram.nextLine();
    System.out.println("The Vowels is-->");
    int count=0;
    for(int i=1;i<str.length();i++){
        char ch = str.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){ count++; }
}
System.out.println(count);
   } 
}
