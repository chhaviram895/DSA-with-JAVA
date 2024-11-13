// * * * * * * * * * 
// *               * 
// *               * 
// *               * 
// *       *       * 
// *         *     * 
// *           *   * 
// *             * * 
// * * * * * * * * * 

import java.util.Scanner;
public class Q{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an no...");
        int n = sc.nextInt();
        System.out.println("Result-->");

        int nst = n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                if(i==1 || i==n || j==1 || j==n ||i==j && i>=n/2+1)
                System.out.print("* ");
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}