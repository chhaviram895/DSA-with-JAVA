// Write a program to input any alphabet and check whether it is vowel or consonants.
import java.util.Scanner;
public class chechAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alpha...");
        char ch = sc.next().charAt(0);

        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' && ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {System.out.println(ch + " is vowel.");}
        else{
            System.out.println(ch + " is consonant.");}

    }
}
