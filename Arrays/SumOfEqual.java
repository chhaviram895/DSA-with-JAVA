// Write a Java program to find the number of pairs in an array whose sum is equal to a given value.

import java.util.Scanner;
public class SumOfEqual {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int[]arr={2,7,4,3,1,9};
    System.out.println("Enter an no...");
    int n= ram.nextInt();
    
    for (int i =0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
        if(arr[i]+arr[j]==n){
            System.out.println(i+"-->"+arr[i]+"        "+j+"-->"+arr[j]);
            break;
        }
        }
    }
   } 
}
