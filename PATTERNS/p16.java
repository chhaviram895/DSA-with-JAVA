// *       *       *       *       *       *       *       *       *
//         *       *       *       *       *       *       *
//                 *       *       *       *       *        
//                         *       *       *
//                                 *
import java.util.Scanner;
public class p16{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst= 2*n-1;int nsp =1-1;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("*\t");
            }
            nsp++; nst-=2;
            System.out.println();
        }
    }
}