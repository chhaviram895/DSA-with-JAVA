// Write a program to find the missing number in a given range of integers represented by an array.

// First Way-->
// public class MissingNo {
//     public static void main(String[] args) {
//         int[] a = {4,7,3,5,1,2};
//         int n = a.length+1;
//         int total = n*(n+1)/2;
//         int sum = 0;
//         for(int i =0;i<a.length;i++){
//             sum+=a[i];
//         }   
//         System.out.println(total-sum);
//     }
// }

// Another Way-->
public class MissingNo {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 4, 7, 3, 5, 1, 2 };
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        System.out.println(sum1 - sum2);
    }
}