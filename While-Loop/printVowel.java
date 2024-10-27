// Write a program that asks the user to enter a sentence and then prints the number of vowels in the sentence using a loop.
import java.util.Scanner;
public class printVowel {
 public static void main(String[] args) {
   Scanner ram = new Scanner(System.in);

   System.out.println("Written the sentence...");
   String str = ram.nextLine();
   System.out.println("The number of vowels-->");
   int count = 0;int i=0;
   while(i<str.length()){
       char ch=str.charAt(i);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
           count++;
       }
       i++;
   }
   System.out.print(count+" ");
 }   
}
