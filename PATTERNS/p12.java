
//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *
//         *       *       *       *
//                 *       *       *
//                         *       *
//                                 *

import java.util.Scanner;

public class p12{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst  = 1,nsp = n-1;

        for (int i = 1; i <=2*n-1; i++) {

            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n){nsp--; nst++;}
            else{nsp++; nst--;}
        }
    }
}