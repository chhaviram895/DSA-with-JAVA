// How do you search for a specific element in a 2D array?

// import java.util.Scanner;

// public class Specific {
//     public static void main(String[] args) {
//         Scanner ram = new Scanner(System.in);
//         int[] arr1 = { 1, 2, 3, 4, 5 };
//         int[] arr2 = { 6, 7, 8, 9, 10 };
//         int[] arr3 = { 11, 12, 13, 14, 15 };
//         int[][] ans1 = { arr1, arr2, arr3 };
//         System.out.println("ENter an no........");
//         int n = ram.nextInt();
//         boolean flag = false;

//         for (int r = 0; r < ans1.length; r++) {
//             for (int c = 0; c < ans1[r].length; c++) {
//                 if (ans1[r][c] == n) {
//                     flag = true;
//                     break;
//                 }
//             }
//         }
//         System.out.println(flag);

//     }
// }

// Another Way---->

import java.util.Scanner;

public class Specific {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an no......");
        int n = ram.nextInt();
        boolean flag = true;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (arr[r][c] != n) {
                    flag = false;
                }
                else{
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);

    }
}