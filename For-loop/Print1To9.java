// Write a program that prints all the numbers from 1 to 10 using a loop.

import java.util.Scanner;

public class Print1To9 {
public static void main(String[] args) {
    Scanner ram=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n =ram.nextInt();
    System.out.println(" Result==>");

    for(int i = 1; i<=n;i++){
            System.out.println(i);}
}
}