// .Write a program to input marks of five subjects Physics, Chemistry, Biology, mathematics, and computer Calculate percentages and grades according to following: 
// Percentage >= 90%: Grade A
// Percentage >= 80%: Grade B
// Percentage >= 70%: Grade C
// Percentage >= 60%: Grade D
// Percentage >= 40%: Grade E     
// Percentage < 40%: Grade F

import java.util.Scanner;

public class fivesub {
    public static void main(String[] args) {
     Scanner ram = new Scanner(System.in);
        System.out.println("Enter the subjects marks :");
       
        double sub1=ram.nextDouble();
        double sub2=ram.nextDouble();
        double sub3=ram.nextDouble();
        double sub4=ram.nextDouble();
        double sub5=ram.nextDouble();
         
        double total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("The Total marks = "+total + "/500");
         double ave = total/5;
        System.out.println("The Average marks = "+ ave);
       
        double per = (total/500)*100;
        System.out.println("The percentage = "+ per);
       
        if (per>=90) {System.out.println("The Grade = A");}        
        else if (per>=80){System.out.println("The Grade = B");}
        else if (per>=70){System.out.println("The Grade = C");}
        else if (per>=60){System.out.println("The Grade = D");}
        else if (per>=50){System.out.println("The Grade = E");}
        else{System.out.println("The Grade = F");}
    }
}
