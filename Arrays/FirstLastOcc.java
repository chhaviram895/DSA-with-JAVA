// How do you find the index of an element's first and last occurrences in an array in Java?

// 1st Way----->
// import java.util.Scanner;
// public class FirstLastOcc {
//     public static void main(String[] args) {
//         Scanner ram = new Scanner(System.in);
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 6, 7, 8 };
//         System.out.println("Enter an no.....");
//         int n = ram.nextInt();
//         int ans1 = -1, ans2 = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == n) {
//                 ans1 = i;
//                 break;
//             }
//         }

//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] == n) {
//                 ans2 = i;
//                 break;
//             }
//         }

//         System.out.println(ans1);
//         System.out.println(ans2);

//     }
// }

// Another way--->
import java.util.Scanner;
public class FirstLastOcc {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1 };
        System.out.println("Enter an no..");
        int n = ram.nextInt();
        int ans1 = -1, ans2 = -1;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n && flag == true) {
                ans1 = i;
                ans2 = -1;
                flag = false;
            } else if (arr[i] == n) {
                ans2 = i;
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}