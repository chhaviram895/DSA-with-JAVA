// A certain grade of steel is graded according to the following conditions
// Hardness must be greater than 50
// Carbon content must be less than 0.7
// Tensile strength must be greater than 5600
// The grades are as follows:
// The grade is 10 if all three conditions are met
// The grade is 9 if conditions (i) and (ii) are met
// The grade is 8 if conditions (ii) and (iii) are met
// The grade is 7 if conditions (i) and (iii) are met
// The grade is 6 if only one condition is met
// The grade is 5 if none of the conditions are met
// Write a program, which will require the user to give values of hardness, carbon content and tensile strength of the steel under consideration and output the grade of the steel

import java.util.Scanner;
public class CheckGrade {
    public static void main(String[] args) {
    Scanner ram= new Scanner(System.in);
        int h = ram.nextInt();
        double c = ram.nextDouble();
        int ts = ram.nextInt();
       
 if(h>50 && c<0.7 && ts>5600){
        System.out.println("Grade 10"); }
else if(h>50 && c<0.7){
         System.out.println("Grade 9"); }
else if(c<0.7 && ts>5600){
         System.out.println("Grade 8"); }
else if(h>50 && ts>5600){
        System.out.println("Grade 7"); }
else if(h>50 ||c<0.7 || ts>5600){
        System.out.println("Grade 6"); }
else{
        System.out.println("Grade 5"); }
    }
}
