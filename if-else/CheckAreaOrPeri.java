// You are given two integers that are the length and breadth of the rectangle. Check whether the area or perimeter is greater

import java.util.Scanner;

public class CheckAreaOrPeri {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Enter the height: ");
    double l=ram.nextDouble();
    System.out.println("Enter the width: ");
    double b=ram.nextDouble();
    double peri = 2*(l+b);
    double area = l*b;
    if(area>peri){          
        System.out.println("Area is: "+area); }
        else{
            System.out.println("Perimeter is: "+peri);}
   } 
}
