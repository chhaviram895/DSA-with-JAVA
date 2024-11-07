//                                 *
//                         *       *       *        
//                 *       *       *       *       *
//         *       *       *       *       *       *       *
// *       *       *       *       *       *       *       *       *

import java.util.Scanner;
public class p15{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst= 1;int nsp =n-1;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n){nsp--; nst+=2;}
            else{nsp++; nst-=2;}
        }
    }
}