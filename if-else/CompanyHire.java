// A company hires a person if 
// If person is married
// if person is unmarried, male and above 30 years of age 
// if person is unmarried , female and above 25 years of age

import java.util.Scanner;

public class CompanyHire {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.print("Enter The Age :");
    int age = ram.nextInt();
    System.out.print("Enter the Gender M/F :");
    char gen = ram.next().charAt(0);
    System.out.print("Enter the Marital Status U/M :");
    char status = ram.next().charAt(0);
   
    if(status == 'M' || status == 'm')
    {          
        System.out.println("Hired.");
    }
    else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
    {          
        System.out.println(" Hired.");
    }
    else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
    {          
        System.out.println(" Hired.");
    }
    else
    {          
        System.out.println(" not Hired.");
    }
}
}