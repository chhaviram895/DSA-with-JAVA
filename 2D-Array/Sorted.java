// How do you find a element in a row wise sorted 2d-array 

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Enetr an no...");
        int n = sc.nextInt();
        int  r = 0, c = arr[0].length - 1;
        int row = 1, col = 1;
        while (arr.length > r && arr[0].length > c) {
            if (arr[r][c] == n) {
                row = r;
                col = c;
                break;
            } else if (arr[r][c] > n) {
                c--;
            } else if (arr[r][c] < n) {
                r++;
            }
        }
        System.out.println("Element found at row " + row + " and column " + col);
    }
}
