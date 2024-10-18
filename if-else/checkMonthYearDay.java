// Write a program to input month number and print month Name

import java.util.Scanner;

public class checkMonthYearDay {
 public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter 1-12...");
       int n = sc.nextInt();
       
       if(n==1){
        System.out.println("This is a january.");}
       else if(n==2){
        System.out.println("This is a febuary.");}
       else if(n==3){
        System.out.println("This is a march.");}
        else if(n==4){
            System.out.println("This is a April.");}
        else if(n==5){
            System.out.println("This is a May.");}
        else if(n==6){
            System.out.println("This is a june.");}
        else if(n==7){
            System.out.println("This is a July.");}
        else if(n==8){
            System.out.println("This is a August.");}
        else if(n==9){
            System.out.println("This is a September.");}
        else if(n==10){
            System.out.println("This is a October.");}
        else if(n==11){
            System.out.println("This is a November.");}
        else if(n==12){
            System.out.println("This is a December.");}
        else{System.out.println("Enter 1 to 12...");}

    }
}