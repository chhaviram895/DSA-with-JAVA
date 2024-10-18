// If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three

import java.util.Scanner;
public class CheckYounger {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the ages: ");
        System.out.println("Enter the age of Ram: ");
        int age1=sc.nextInt();
        System.out.println("Enter the age of Shyam: ");
        int age2=sc.nextInt();
        System.out.println("Enter the age of Ajay: ");
        int age3=sc.nextInt();
       
        if(age1<age2 && age1<age3){
            System.out.println("The youngest age is Ram.");
        }
        else if(age2<age1 && age2<age3){
            System.out.println("The youngest age is Shyam.");
        }
        else{
            System.out.println("The youngest age is Ajay.");
        }
    }
}
