// * * * * *       *
//         *       * 
//         *       * 
//         *       *
// * * * * * * * * * 
// *       *
// *       *
// *       *
// *       * * * * * 
import java.util.Scanner;
public class Swastik {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an no...");
        int n = sc.nextInt();
        System.out.println("Result-->");

        int nst = n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                if(i==n/2+1||j==n/2+1||i==1 && j<=n/2+1||j==1 && i>=n/2+1|| i==n && j>=n/2+1 || j==n && i<=n/2+1)
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