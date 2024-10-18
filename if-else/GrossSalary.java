// Write a program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary <= 10000: HRA = 20%, DA = 80%
// Basic Salary <= 20000: HRA = 25%, DA = 90%
// Basic Salary > 20,000: HRA = 30%, DA = 95%
// Hint -> Gross Salary = basic Salary + HRA + DA

import java.util.Scanner;

public class GrossSalary {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int bs = ram.nextInt();
    if(bs<=10000){
        System.out.println(2*bs);  }
   else if(bs<=20000){
        System.out.println(2.15*bs); }
   else if(bs>20000){
        System.out.println(2.25*bs); }

   } 
}
