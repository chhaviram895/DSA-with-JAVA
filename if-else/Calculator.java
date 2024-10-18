// Write a Java program to create a simple calculator for calculating a two number calculations 
// Hint-> Take 2 Input of Number and one character as sign (-, +, *, /)

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int a = ram.nextInt();
    char sign = ram.next().charAt(0);
    int b = ram.nextInt();
    if(sign == '+'){
        System.out.println(a+b); }
   else if(sign == '-'){
        System.out.println(a-b);  }
   else if(sign == '*'){
        System.out.println(a*b); }
   else if(sign == '/'){
        System.out.println(a/b); }

}    
}
