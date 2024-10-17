// Write a program to input all angles of a triangle and check whether it is valid or not
import java.util.Scanner;
public class checkTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = sc.nextInt();
         if(a+b+c==180){
            System.out.println("Triangle is valid.");
          }
          else{
            System.out.println("Triangle is not valid."); }
    }
}
