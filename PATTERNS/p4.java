// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "\t");
                c++;
            }
            System.out.println();
        }
    }
}