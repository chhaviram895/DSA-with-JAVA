// *                                                               *
// *       *                                               *       *
// *       *       *                               *       *       *
// *       *       *       *               *       *       *       *
// *       *       *       *       *       *       *       *       *
// *       *       *       *               *       *       *       *
// *       *       *                               *       *       *
// *       *                                               *       *
// *                                                               *
import java.util.Scanner;
public class p17{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst= 1;int nsp =2*n-3;

        for (int i = 1; i <=2*n-1; i++) {

            for (int j = 1; j <=nst; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
               if(j==1 && i==n){
                j++;
               }
                System.out.print("*\t");
            }
            if(i<n){nst++; nsp-=2;}
            else{nst--; nsp+=2;}
            System.out.println();
        }
    }
}