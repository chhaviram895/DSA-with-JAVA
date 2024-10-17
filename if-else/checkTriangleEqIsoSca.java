// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
import java.util.Scanner;
public class checkTriangleEqIsoSca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("It is an Equilateral triangle."); }
         else if(a==b || b==c||a==c){
            System.out.println("It is an Isosceles triangle."); }
         else{
            System.out.println("It is an Scalene triangle."); }
    }
}
