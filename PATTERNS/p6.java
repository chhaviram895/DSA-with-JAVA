// 1
// 2       6
// 3       7       10
// 4       8       11      13
// 5       9       12      14      15

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        for (int i = 1; i <= n; i++) {
            int c = i, d = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "\t");
                c += d;
                d--;
            }
            System.out.println();
        }
    }
}