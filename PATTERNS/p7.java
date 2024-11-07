// *       *       *       *      *
// *       *       *       *
// *       *       *
// *       *
// *

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}