// Write a program to find the power of a number Take two inputs. 

import java.util.Scanner;
public class printPower {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);

        System.out.println("Enter the number and power....");
        int x=ram.nextInt();
        int n= ram.nextInt();
        System.out.println("Power of number-->");

        int ans=1; 
        while(n>0){
           ans*=x ;
           n--;
        }
        System.out.println(ans);
    }
}
