// Write a program to count the number of even elements in an integer array.

import java.util.Scanner;
public class Even {
   public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,9};
        int count = 0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]%2==0) {
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println(count);
   } 
}
