// Write a program to find the sum of digits of two arrays. 

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int a[] = { 9, 8, 6, 3, 1, 2, 3, 9 };
        int b[] = { 9, 2, 4, 6, 5, 4, 7, 6 };
        int c = Math.max(a.length, b.length);
        int res[] = new int[c];

        int p1 = a.length - 1;
        int p2 = b.length - 1;
        int p3 = c - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int val1 = p1 >= 0 ? a[p1] : 0;
            int val2 = p2 >= 0 ? a[p2] : 0;

            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;

            res[p3] = d;
            p1--;
            p2--;
            p3--;
        }

        int[] res2;
        if (carry == 1) {
            res2 = new int[res.length + 1];
            res2[0] = 1;
            for (int i = 0; i < res.length; i++) {
                res2[i + 1] = res[i];
            }
        } else {
            res2 = res;
        }
        System.out.println(Arrays.toString(res2));
    }
}
