// *
// *       *
// *       *       *
// *       *       *       *
// *       *       *       *       *

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int n = ram.nextInt();
        System.out.println("Result==>");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
