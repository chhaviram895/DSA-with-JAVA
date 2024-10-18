// When purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100. If quantity and price per item are input through the keyboard, write a program to calculate the total expenses

import java.util.Scanner;

public class Discount {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int q = ram.nextInt();
    int p = ram.nextInt();
    double total = p * 0.9;
 if(q>100){
        System.out.println(total*q); }
   else{
        System.out.println(p*q);  }
}    
}
