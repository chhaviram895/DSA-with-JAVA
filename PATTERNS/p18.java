//                                 *
//                         *               *        
//                 *                               *
//         *                                               *
// *                                                               *
//         *                                               *
//                 *                               *
//                         *               *
//                                 *
import java.util.Scanner;
public class p18{
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        System.out.println("Enter an number..");
        int n = ram.nextInt();
        System.out.println("Result==>");
        int nst= 1;int nsp =n-1;

        for (int i = 1; i <=2*n-1; i++) {

            for (int j = 1; j <=nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=nst; j++) {
               if(j==1 || j==nst){
                   System.out.print("*\t");
                }
                else{
                    System.out.print(" \t"); }
            }
            if(i<n){nst+=2; nsp--;}
            else{nst-=2; nsp++;}
            System.out.println();
        }
    }
}