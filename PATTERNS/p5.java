// 1
// 0       1
// 0       1       0
// 1       0       1       0
// 1       0       1       0       1

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "\t");
                if (c == 1) {
                    c = 0;
                } else {
                    c = 1;
                }
            }
            System.out.println();
        }
    }
}