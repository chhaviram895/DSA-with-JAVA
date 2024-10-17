// Write a program to check whether a number is negative, positive or zero

import java.util.Scanner;
public class checkNoPositiveNegative {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0){
        System.out.println("The number is positive."); }
        else if(n<0){System.out.println("The nuber is negative.");}
        else{System.out.println("Zero");}
   }
}
