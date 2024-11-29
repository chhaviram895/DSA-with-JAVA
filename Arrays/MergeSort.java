// Write a program to merge two sorted arrays into a single sorted array.

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1={3,5,6,9,10,15};
        int[] arr2={1,4,5,6,7,8};
    
        int[] ans=new int[arr1.length+arr2.length];
        int p1=0; int p2=0; int p3=0;

        while (p3<ans.length) {
            int val1=p1<arr1.length?arr1[p1]:Integer.MAX_VALUE; 
            int val2=p2<arr2.length?arr2[p2]:Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3]=val1;
                p1++;
                p3++;
            }
            else{
                ans[p3]=val2;
                p2++;
                p3++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
