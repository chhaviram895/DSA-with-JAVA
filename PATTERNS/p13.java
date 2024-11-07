// *       *       *       *       *
//         *       *       *       *
//                 *       *       *
//                         *       *
//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *

import java.util.Scanner;
public class p13{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst  = n,nsp =0;

        for (int i = 1; i <=2*n-1; i++) {

            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n){nsp++; nst--;}
            else{nsp--; nst++;}
        }
    }
}