// *       *       *       *       *
// *       *       *       *       *
// *       *       *       *       *
// *       *       *       *       *
// *       *       *       *       *
import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an no...");
        int n = sc.nextInt();
        System.out.println("Result-->");

        int nst = n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
    }
}
}