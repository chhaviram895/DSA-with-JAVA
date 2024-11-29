// Write a program to find the index of a specific element in an integer array.

import java.util.Scanner;

public class SpecificIndex {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int[] arr={1,2,3,4,5,6,7,8};
    System.out.println("Enter an no....");
    int n=ram.nextInt();
    int ans=-1;

for(int i=0;i<arr.length;i++){
   if(arr[i]==n){
    ans=i;
    break;
   }
}
System.out.println(ans);
} 
}
