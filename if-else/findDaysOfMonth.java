// Write a Java program to find days in a month (Take input of Year and month number). 

import java.util.Scanner;
public class findDaysOfMonth {
public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    System.out.println("Enter an month: ");
    int month = ram.nextInt();
    System.out.println("Enter an year: ");
    int year = ram.nextInt();
    if(((month==2)  && (year%4==0)) || ((year%100==0)&&(year%400==0))){
        System.out.println("number of days is 29."); }
        else if(month==2){
        System.out.println("number of days is 28. "); }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
        System.out.println("number of days is 31."); }
        else{
        System.out.println("number of days is 30."); }
}
}